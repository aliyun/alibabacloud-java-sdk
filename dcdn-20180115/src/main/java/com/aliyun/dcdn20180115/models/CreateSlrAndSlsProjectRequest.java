// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateSlrAndSlsProjectRequest extends TeaModel {
    /**
     * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
     * <ul>
     * <li><strong>cdn_log_access_l1</strong>: access logs of L1 Dynamic Route for CDN (DCDN) points of presence (POPs)</li>
     * <li><strong>cdn_log_origin</strong>: back-to-origin logs</li>
     * <li><strong>cdn_log_er</strong>: EdgeRoutine logs</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The region where Log Service resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong></li>
     * <li><strong>cn-shanghai</strong></li>
     * <li><strong>cn-qingdao</strong></li>
     * <li><strong>cn-beijing</strong></li>
     * <li><strong>cn-zhangjiakou</strong></li>
     * <li><strong>cn-shenzhen</strong></li>
     * <li><strong>eu-central-1</strong></li>
     * <li><strong>us-west-1</strong></li>
     * <li><strong>ap-south-1</strong></li>
     * <li><strong>ap-southeast-1</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    public static CreateSlrAndSlsProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrAndSlsProjectRequest self = new CreateSlrAndSlsProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlrAndSlsProjectRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateSlrAndSlsProjectRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
