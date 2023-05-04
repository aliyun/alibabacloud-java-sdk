// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindBatchAxgResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretBindList")
    public BindBatchAxgResponseBodySecretBindList secretBindList;

    public static BindBatchAxgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindBatchAxgResponseBody self = new BindBatchAxgResponseBody();
        return TeaModel.build(map, self);
    }

    public BindBatchAxgResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindBatchAxgResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindBatchAxgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindBatchAxgResponseBody setSecretBindList(BindBatchAxgResponseBodySecretBindList secretBindList) {
        this.secretBindList = secretBindList;
        return this;
    }
    public BindBatchAxgResponseBodySecretBindList getSecretBindList() {
        return this.secretBindList;
    }

    public static class BindBatchAxgResponseBodySecretBindListSecretBind extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Message")
        public String message;

        @NameInMap("PhoneNoA")
        public String phoneNoA;

        @NameInMap("SecretNo")
        public String secretNo;

        @NameInMap("SubsId")
        public String subsId;

        public static BindBatchAxgResponseBodySecretBindListSecretBind build(java.util.Map<String, ?> map) throws Exception {
            BindBatchAxgResponseBodySecretBindListSecretBind self = new BindBatchAxgResponseBodySecretBindListSecretBind();
            return TeaModel.build(map, self);
        }

        public BindBatchAxgResponseBodySecretBindListSecretBind setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BindBatchAxgResponseBodySecretBindListSecretBind setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public BindBatchAxgResponseBodySecretBindListSecretBind setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BindBatchAxgResponseBodySecretBindListSecretBind setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BindBatchAxgResponseBodySecretBindListSecretBind setPhoneNoA(String phoneNoA) {
            this.phoneNoA = phoneNoA;
            return this;
        }
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        public BindBatchAxgResponseBodySecretBindListSecretBind setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindBatchAxgResponseBodySecretBindListSecretBind setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

    }

    public static class BindBatchAxgResponseBodySecretBindList extends TeaModel {
        @NameInMap("SecretBind")
        public java.util.List<BindBatchAxgResponseBodySecretBindListSecretBind> secretBind;

        public static BindBatchAxgResponseBodySecretBindList build(java.util.Map<String, ?> map) throws Exception {
            BindBatchAxgResponseBodySecretBindList self = new BindBatchAxgResponseBodySecretBindList();
            return TeaModel.build(map, self);
        }

        public BindBatchAxgResponseBodySecretBindList setSecretBind(java.util.List<BindBatchAxgResponseBodySecretBindListSecretBind> secretBind) {
            this.secretBind = secretBind;
            return this;
        }
        public java.util.List<BindBatchAxgResponseBodySecretBindListSecretBind> getSecretBind() {
            return this.secretBind;
        }

    }

}
