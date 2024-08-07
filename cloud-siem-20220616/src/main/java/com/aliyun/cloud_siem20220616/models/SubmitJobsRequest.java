// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SubmitJobsRequest extends TeaModel {
    /**
     * <p>The parameters of the logs that you want to add. The value is a JSON array, which contains the following parameters:\</p>
     * <ul>
     * <li><p>SourceProdCode: the code of the cloud service.</p>
     * </li>
     * <li><p>SourceLogCode: the code of the log.</p>
     * </li>
     * <li><p>Deleted: specifies whether to add the log. Valid values:</p>
     * <ul>
     * <li>0: yes</li>
     * <li>1: no</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;SourceLogCode&quot;:&quot;cloud_siem_aegis_health_check&quot;,&quot;SourceProdCode&quot;:&quot;sas&quot;,&quot;SubUserId&quot;:120xxxxxxx,&quot;Deleted&quot;:0},{&quot;SourceLogCode&quot;:&quot;cloud_siem_aegis_health_check&quot;,&quot;SourceProdCode&quot;:&quot;sas&quot;,&quot;SubUserId&quot;:121xxxxxxxx,&quot;Deleted&quot;:0},{&quot;SourceLogCode&quot;:&quot;cloud_siem_aegis_health_check&quot;,&quot;SourceProdCode&quot;:&quot;sas&quot;,&quot;SubUserId&quot;:122xxxxxxx,&quot;Deleted&quot;:1}]</p>
     */
    @NameInMap("JsonParam")
    public String jsonParam;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
