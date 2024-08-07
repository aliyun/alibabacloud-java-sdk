// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeJobStatusRequest extends TeaModel {
    /**
     * <p>The region where the service resides. Default value: cn-shanghai.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the collection task. The ID is the value of the submitId parameter in the response of the <a href="https://next.api.aliyun.com/api/cloud-siem/2022-06-16/BatchSubmitJob?lang=JAVA%5C&useCommon=true">BatchJobSubmit</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_folder_xxxxxx</p>
     */
    @NameInMap("SubmitId")
    public String submitId;

    public static DescribeJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobStatusRequest self = new DescribeJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeJobStatusRequest setSubmitId(String submitId) {
        this.submitId = submitId;
        return this;
    }
    public String getSubmitId() {
        return this.submitId;
    }

}
