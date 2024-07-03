// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindBatchAxgResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5DCCA8CD-6C0A-50B4-A496-B1D2AB48A1C3</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>isv.INVALID_PARAMETERS</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>257</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>ringConfig invalid</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>13333333333</p>
         */
        @NameInMap("PhoneNoA")
        public String phoneNoA;

        /**
         * <strong>example:</strong>
         * <p>13333333333</p>
         */
        @NameInMap("SecretNo")
        public String secretNo;

        /**
         * <strong>example:</strong>
         * <p>1000085060515673</p>
         */
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
