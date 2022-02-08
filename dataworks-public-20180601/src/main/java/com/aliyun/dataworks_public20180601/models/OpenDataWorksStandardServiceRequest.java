// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class OpenDataWorksStandardServiceRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    public static OpenDataWorksStandardServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenDataWorksStandardServiceRequest self = new OpenDataWorksStandardServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenDataWorksStandardServiceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
