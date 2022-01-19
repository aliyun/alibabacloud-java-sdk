// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeAttackEventResponseBody extends TeaModel {
    @NameInMap("EventList")
    public java.util.List<DescribeAttackEventResponseBodyEventList> eventList;

    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAttackEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackEventResponseBody self = new DescribeAttackEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAttackEventResponseBody setEventList(java.util.List<DescribeAttackEventResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<DescribeAttackEventResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public DescribeAttackEventResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribeAttackEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAttackEventResponseBodyEventList extends TeaModel {
        @NameInMap("AttackType")
        public String attackType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateStamp")
        public Integer gmtCreateStamp;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("Url")
        public String url;

        @NameInMap("VmIp")
        public String vmIp;

        public static DescribeAttackEventResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAttackEventResponseBodyEventList self = new DescribeAttackEventResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public DescribeAttackEventResponseBodyEventList setAttackType(String attackType) {
            this.attackType = attackType;
            return this;
        }
        public String getAttackType() {
            return this.attackType;
        }

        public DescribeAttackEventResponseBodyEventList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAttackEventResponseBodyEventList setGmtCreateStamp(Integer gmtCreateStamp) {
            this.gmtCreateStamp = gmtCreateStamp;
            return this;
        }
        public Integer getGmtCreateStamp() {
            return this.gmtCreateStamp;
        }

        public DescribeAttackEventResponseBodyEventList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAttackEventResponseBodyEventList setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeAttackEventResponseBodyEventList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeAttackEventResponseBodyEventList setVmIp(String vmIp) {
            this.vmIp = vmIp;
            return this;
        }
        public String getVmIp() {
            return this.vmIp;
        }

    }

}
