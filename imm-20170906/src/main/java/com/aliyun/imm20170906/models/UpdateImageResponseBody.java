// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class UpdateImageResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("RemarksA")
    public String remarksA;

    @NameInMap("RemarksArrayA")
    public String remarksArrayA;

    @NameInMap("RemarksArrayB")
    public String remarksArrayB;

    @NameInMap("RemarksB")
    public String remarksB;

    @NameInMap("RemarksC")
    public String remarksC;

    @NameInMap("RemarksD")
    public String remarksD;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetId")
    public String setId;

    public static UpdateImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageResponseBody self = new UpdateImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateImageResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public UpdateImageResponseBody setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public UpdateImageResponseBody setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public UpdateImageResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public UpdateImageResponseBody setRemarksA(String remarksA) {
        this.remarksA = remarksA;
        return this;
    }
    public String getRemarksA() {
        return this.remarksA;
    }

    public UpdateImageResponseBody setRemarksArrayA(String remarksArrayA) {
        this.remarksArrayA = remarksArrayA;
        return this;
    }
    public String getRemarksArrayA() {
        return this.remarksArrayA;
    }

    public UpdateImageResponseBody setRemarksArrayB(String remarksArrayB) {
        this.remarksArrayB = remarksArrayB;
        return this;
    }
    public String getRemarksArrayB() {
        return this.remarksArrayB;
    }

    public UpdateImageResponseBody setRemarksB(String remarksB) {
        this.remarksB = remarksB;
        return this;
    }
    public String getRemarksB() {
        return this.remarksB;
    }

    public UpdateImageResponseBody setRemarksC(String remarksC) {
        this.remarksC = remarksC;
        return this;
    }
    public String getRemarksC() {
        return this.remarksC;
    }

    public UpdateImageResponseBody setRemarksD(String remarksD) {
        this.remarksD = remarksD;
        return this;
    }
    public String getRemarksD() {
        return this.remarksD;
    }

    public UpdateImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateImageResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

}
