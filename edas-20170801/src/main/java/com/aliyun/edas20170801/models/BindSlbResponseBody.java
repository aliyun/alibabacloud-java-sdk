// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindSlbResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public BindSlbResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    public static BindSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindSlbResponseBody self = new BindSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public BindSlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindSlbResponseBody setData(BindSlbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindSlbResponseBodyData getData() {
        return this.data;
    }

    public BindSlbResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class BindSlbResponseBodyData extends TeaModel {
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("ExtSlbIp")
        public String extSlbIp;

        @NameInMap("SlbPort")
        public Integer slbPort;

        @NameInMap("ExtSlbName")
        public String extSlbName;

        @NameInMap("ExtSlbId")
        public String extSlbId;

        @NameInMap("ExtVServerGroupId")
        public String extVServerGroupId;

        @NameInMap("SlbName")
        public String slbName;

        @NameInMap("SlbIp")
        public String slbIp;

        public static BindSlbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindSlbResponseBodyData self = new BindSlbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindSlbResponseBodyData setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public BindSlbResponseBodyData setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public BindSlbResponseBodyData setExtSlbIp(String extSlbIp) {
            this.extSlbIp = extSlbIp;
            return this;
        }
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        public BindSlbResponseBodyData setSlbPort(Integer slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public Integer getSlbPort() {
            return this.slbPort;
        }

        public BindSlbResponseBodyData setExtSlbName(String extSlbName) {
            this.extSlbName = extSlbName;
            return this;
        }
        public String getExtSlbName() {
            return this.extSlbName;
        }

        public BindSlbResponseBodyData setExtSlbId(String extSlbId) {
            this.extSlbId = extSlbId;
            return this;
        }
        public String getExtSlbId() {
            return this.extSlbId;
        }

        public BindSlbResponseBodyData setExtVServerGroupId(String extVServerGroupId) {
            this.extVServerGroupId = extVServerGroupId;
            return this;
        }
        public String getExtVServerGroupId() {
            return this.extVServerGroupId;
        }

        public BindSlbResponseBodyData setSlbName(String slbName) {
            this.slbName = slbName;
            return this;
        }
        public String getSlbName() {
            return this.slbName;
        }

        public BindSlbResponseBodyData setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

    }

}
