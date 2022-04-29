// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderCreateRequest extends TeaModel {
    // 性别
    @NameInMap("Gender")
    public Long gender;

    @NameInMap("Jwt")
    public String jwt;

    // 照片地址
    @NameInMap("PhotoPath")
    public String photoPath;

    public static OrderCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderCreateRequest self = new OrderCreateRequest();
        return TeaModel.build(map, self);
    }

    public OrderCreateRequest setGender(Long gender) {
        this.gender = gender;
        return this;
    }
    public Long getGender() {
        return this.gender;
    }

    public OrderCreateRequest setJwt(String jwt) {
        this.jwt = jwt;
        return this;
    }
    public String getJwt() {
        return this.jwt;
    }

    public OrderCreateRequest setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
        return this;
    }
    public String getPhotoPath() {
        return this.photoPath;
    }

}
