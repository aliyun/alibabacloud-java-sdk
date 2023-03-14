// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListValueAddedResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ValueAddedList")
    public java.util.List<ListValueAddedResponseBodyValueAddedList> valueAddedList;

    public static ListValueAddedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListValueAddedResponseBody self = new ListValueAddedResponseBody();
        return TeaModel.build(map, self);
    }

    public ListValueAddedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListValueAddedResponseBody setValueAddedList(java.util.List<ListValueAddedResponseBodyValueAddedList> valueAddedList) {
        this.valueAddedList = valueAddedList;
        return this;
    }
    public java.util.List<ListValueAddedResponseBodyValueAddedList> getValueAddedList() {
        return this.valueAddedList;
    }

    public static class ListValueAddedResponseBodyValueAddedList extends TeaModel {
        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LogSize")
        public Long logSize;

        @NameInMap("Status")
        public Integer status;

        public static ListValueAddedResponseBodyValueAddedList build(java.util.Map<String, ?> map) throws Exception {
            ListValueAddedResponseBodyValueAddedList self = new ListValueAddedResponseBodyValueAddedList();
            return TeaModel.build(map, self);
        }

        public ListValueAddedResponseBodyValueAddedList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListValueAddedResponseBodyValueAddedList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListValueAddedResponseBodyValueAddedList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListValueAddedResponseBodyValueAddedList setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

        public ListValueAddedResponseBodyValueAddedList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
