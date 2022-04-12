// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindSlbResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public BindSlbResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static BindSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindSlbResponseBody self = new BindSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public BindSlbResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BindSlbResponseBody setData(BindSlbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindSlbResponseBodyData getData() {
        return this.data;
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

    public static class BindSlbResponseBodyData extends TeaModel {
        @NameInMap("ExtSlbId")
        public String extSlbId;

        @NameInMap("ExtSlbIp")
        public String extSlbIp;

        @NameInMap("ExtSlbName")
        public String extSlbName;

        @NameInMap("ExtVServerGroupId")
        public String extVServerGroupId;

        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("SlbIp")
        public String slbIp;

        @NameInMap("SlbName")
        public String slbName;

        @NameInMap("SlbPort")
        public Integer slbPort;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        public static BindSlbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindSlbResponseBodyData self = new BindSlbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindSlbResponseBodyData setExtSlbId(String extSlbId) {
            this.extSlbId = extSlbId;
            return this;
        }
        public String getExtSlbId() {
            return this.extSlbId;
        }

        public BindSlbResponseBodyData setExtSlbIp(String extSlbIp) {
            this.extSlbIp = extSlbIp;
            return this;
        }
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        public BindSlbResponseBodyData setExtSlbName(String extSlbName) {
            this.extSlbName = extSlbName;
            return this;
        }
        public String getExtSlbName() {
            return this.extSlbName;
        }

        public BindSlbResponseBodyData setExtVServerGroupId(String extVServerGroupId) {
            this.extVServerGroupId = extVServerGroupId;
            return this;
        }
        public String getExtVServerGroupId() {
            return this.extVServerGroupId;
        }

        public BindSlbResponseBodyData setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public BindSlbResponseBodyData setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public BindSlbResponseBodyData setSlbName(String slbName) {
            this.slbName = slbName;
            return this;
        }
        public String getSlbName() {
            return this.slbName;
        }

        public BindSlbResponseBodyData setSlbPort(Integer slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public Integer getSlbPort() {
            return this.slbPort;
        }

        public BindSlbResponseBodyData setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

    }

}
