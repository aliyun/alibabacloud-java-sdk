// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class PackSDKRequest extends TeaModel {
    @NameInMap("ProductID")
    @Validation(required = true)
    public String productID;

    @NameInMap("OS")
    @Validation(required = true)
    public String OS;

    public static PackSDKRequest build(java.util.Map<String, ?> map) throws Exception {
        PackSDKRequest self = new PackSDKRequest();
        return TeaModel.build(map, self);
    }

    public PackSDKRequest setProductID(String productID) {
        this.productID = productID;
        return this;
    }
    public String getProductID() {
        return this.productID;
    }

    public PackSDKRequest setOS(String OS) {
        this.OS = OS;
        return this;
    }
    public String getOS() {
        return this.OS;
    }

}
