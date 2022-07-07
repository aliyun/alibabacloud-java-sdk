// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CreateShopRequest extends TeaModel {
    @NameInMap("ExtInfo")
    public java.util.Map<String, String> extInfo;

    @NameInMap("TbShopDescription")
    public String tbShopDescription;

    @NameInMap("TbShopId")
    public String tbShopId;

    @NameInMap("TbShopName")
    public String tbShopName;

    // token
    @NameInMap("Token")
    public String token;

    @NameInMap("Type")
    public String type;

    public static CreateShopRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShopRequest self = new CreateShopRequest();
        return TeaModel.build(map, self);
    }

    public CreateShopRequest setExtInfo(java.util.Map<String, String> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, String> getExtInfo() {
        return this.extInfo;
    }

    public CreateShopRequest setTbShopDescription(String tbShopDescription) {
        this.tbShopDescription = tbShopDescription;
        return this;
    }
    public String getTbShopDescription() {
        return this.tbShopDescription;
    }

    public CreateShopRequest setTbShopId(String tbShopId) {
        this.tbShopId = tbShopId;
        return this;
    }
    public String getTbShopId() {
        return this.tbShopId;
    }

    public CreateShopRequest setTbShopName(String tbShopName) {
        this.tbShopName = tbShopName;
        return this;
    }
    public String getTbShopName() {
        return this.tbShopName;
    }

    public CreateShopRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateShopRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
