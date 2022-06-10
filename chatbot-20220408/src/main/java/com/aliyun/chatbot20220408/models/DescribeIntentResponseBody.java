// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeIntentResponseBody extends TeaModel {
    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("CreateUserName")
    public String createUserName;

    @NameInMap("IntentId")
    public Long intentId;

    @NameInMap("IntentName")
    public String intentName;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("ModifyUserId")
    public String modifyUserId;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlotInfos")
    public java.util.List<DescribeIntentResponseBodySlotInfos> slotInfos;

    public static DescribeIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntentResponseBody self = new DescribeIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIntentResponseBody setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeIntentResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeIntentResponseBody setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public DescribeIntentResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeIntentResponseBody setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public DescribeIntentResponseBody setIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }
    public String getIntentName() {
        return this.intentName;
    }

    public DescribeIntentResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeIntentResponseBody setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeIntentResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIntentResponseBody setSlotInfos(java.util.List<DescribeIntentResponseBodySlotInfos> slotInfos) {
        this.slotInfos = slotInfos;
        return this;
    }
    public java.util.List<DescribeIntentResponseBodySlotInfos> getSlotInfos() {
        return this.slotInfos;
    }

    public static class DescribeIntentResponseBodySlotInfos extends TeaModel {
        @NameInMap("Array")
        public Boolean array;

        @NameInMap("Encrypt")
        public Boolean encrypt;

        @NameInMap("Interactive")
        public Boolean interactive;

        @NameInMap("Name")
        public String name;

        @NameInMap("SlotId")
        public String slotId;

        @NameInMap("Value")
        public String value;

        public static DescribeIntentResponseBodySlotInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentResponseBodySlotInfos self = new DescribeIntentResponseBodySlotInfos();
            return TeaModel.build(map, self);
        }

        public DescribeIntentResponseBodySlotInfos setArray(Boolean array) {
            this.array = array;
            return this;
        }
        public Boolean getArray() {
            return this.array;
        }

        public DescribeIntentResponseBodySlotInfos setEncrypt(Boolean encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public Boolean getEncrypt() {
            return this.encrypt;
        }

        public DescribeIntentResponseBodySlotInfos setInteractive(Boolean interactive) {
            this.interactive = interactive;
            return this;
        }
        public Boolean getInteractive() {
            return this.interactive;
        }

        public DescribeIntentResponseBodySlotInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIntentResponseBodySlotInfos setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public DescribeIntentResponseBodySlotInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
