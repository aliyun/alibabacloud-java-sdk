// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateSlrAndSlsProjectRequest extends TeaModel {
    /**
     * <p>*   ****</p>
     * <p>*   ****</p>
     * <p>*   ****</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>*   **cn-hangzhou**</p>
     * <p>*   **cn-shanghai**</p>
     * <p>*   **cn-qingdao**</p>
     * <p>*   **cn-beijing**</p>
     * <p>*   **cn-zhangjiakou**</p>
     * <p>*   **cn-shenzhen**</p>
     * <p>*   **eu-central-1**</p>
     * <p>*   **us-west-1**</p>
     * <p>*   **ap-south-1**</p>
     * <p>*   **ap-southeast-1**</p>
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
