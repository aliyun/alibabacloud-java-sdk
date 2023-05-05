// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CheckUpgradeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CheckUpgradeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckUpgradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUpgradeResponseBody self = new CheckUpgradeResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUpgradeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckUpgradeResponseBody setData(CheckUpgradeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckUpgradeResponseBodyData getData() {
        return this.data;
    }

    public CheckUpgradeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckUpgradeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckUpgradeResponseBodyData extends TeaModel {
        @NameInMap("Comments")
        public String comments;

        @NameInMap("ForceUpgrade")
        public Boolean forceUpgrade;

        @NameInMap("Size")
        public String size;

        @NameInMap("Version")
        public String version;

        public static CheckUpgradeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckUpgradeResponseBodyData self = new CheckUpgradeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckUpgradeResponseBodyData setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public CheckUpgradeResponseBodyData setForceUpgrade(Boolean forceUpgrade) {
            this.forceUpgrade = forceUpgrade;
            return this;
        }
        public Boolean getForceUpgrade() {
            return this.forceUpgrade;
        }

        public CheckUpgradeResponseBodyData setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public CheckUpgradeResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
