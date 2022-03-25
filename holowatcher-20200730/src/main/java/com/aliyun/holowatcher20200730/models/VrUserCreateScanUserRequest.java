// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class VrUserCreateScanUserRequest extends TeaModel {
    // 业务幂等ID，用于防止重复请求，写操作必传
    @NameInMap("BizOrderNo")
    public String bizOrderNo;

    // 用户需要创建扫描权限账号的手机号码
    @NameInMap("PhoneNum")
    public String phoneNum;

    // 数据源，目前只有3VJIA，需要新增请联系接口owner
    @NameInMap("Source")
    public String source;

    public static VrUserCreateScanUserRequest build(java.util.Map<String, ?> map) throws Exception {
        VrUserCreateScanUserRequest self = new VrUserCreateScanUserRequest();
        return TeaModel.build(map, self);
    }

    public VrUserCreateScanUserRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public VrUserCreateScanUserRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public VrUserCreateScanUserRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
