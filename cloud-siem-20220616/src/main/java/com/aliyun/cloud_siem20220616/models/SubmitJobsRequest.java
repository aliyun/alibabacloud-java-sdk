// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SubmitJobsRequest extends TeaModel {
    /**
     * <p>The parameters of the logs that you want to add. The value is a JSON array, which contains the following parameters:\</p>
     * <br>
     * <br>
     * <p>*   SourceProdCode: the code of the cloud service.</p>
     * <br>
     * <p>*   SourceLogCode: the code of the log.</p>
     * <br>
     * <p>*   Deleted: specifies whether to add the log. Valid values:</p>
     * <br>
     * <p>    *   0: yes</p>
     * <p>    *   1: no</p>
     */
    @NameInMap("JsonParam")
    public String jsonParam;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SubmitJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobsRequest self = new SubmitJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitJobsRequest setJsonParam(String jsonParam) {
        this.jsonParam = jsonParam;
        return this;
    }
    public String getJsonParam() {
        return this.jsonParam;
    }

    public SubmitJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
