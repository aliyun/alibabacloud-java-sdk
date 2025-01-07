// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaDetailStandardVerifyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>429001********8211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <strong>example:</strong>
     * <p>138********</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    @NameInMap("UserName")
    public String userName;

    public static Mobile3MetaDetailStandardVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaDetailStandardVerifyRequest self = new Mobile3MetaDetailStandardVerifyRequest();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaDetailStandardVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Mobile3MetaDetailStandardVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Mobile3MetaDetailStandardVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Mobile3MetaDetailStandardVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
