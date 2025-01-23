// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApiTestRequest extends TeaModel {
    /**
     * <p>The Id of the test. TestDataServiceApi is executed asynchronously after the API is called and the test Id is returned. You can also use ListDataServiceApiTest to obtain the latest test Id.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123434</p>
     */
    @NameInMap("TestId")
    public Long testId;

    public static GetDataServiceApiTestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiTestRequest self = new GetDataServiceApiTestRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiTestRequest setTestId(Long testId) {
        this.testId = testId;
        return this;
    }
    public Long getTestId() {
        return this.testId;
    }

}
