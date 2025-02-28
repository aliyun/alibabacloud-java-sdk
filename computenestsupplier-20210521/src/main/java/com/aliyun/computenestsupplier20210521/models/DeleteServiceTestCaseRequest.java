// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteServiceTestCaseRequest extends TeaModel {
    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service test case id.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stc-0b2a3ad7e1de4c299eec</p>
     */
    @NameInMap("TestCaseId")
    public String testCaseId;

    public static DeleteServiceTestCaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTestCaseRequest self = new DeleteServiceTestCaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTestCaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteServiceTestCaseRequest setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
        return this;
    }
    public String getTestCaseId() {
        return this.testCaseId;
    }

}
