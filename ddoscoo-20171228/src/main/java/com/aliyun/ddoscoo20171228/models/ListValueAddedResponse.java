// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListValueAddedResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ValueAddedList")
    @Validation(required = true)
    public java.util.List<ListValueAddedResponseValueAddedList> valueAddedList;

    public static ListValueAddedResponse build(java.util.Map<String, ?> map) throws Exception {
        ListValueAddedResponse self = new ListValueAddedResponse();
        return TeaModel.build(map, self);
    }

    public ListValueAddedResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListValueAddedResponse setValueAddedList(java.util.List<ListValueAddedResponseValueAddedList> valueAddedList) {
        this.valueAddedList = valueAddedList;
        return this;
    }
    public java.util.List<ListValueAddedResponseValueAddedList> getValueAddedList() {
        return this.valueAddedList;
    }

    public static class ListValueAddedResponseValueAddedList extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public Long expireTime;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("LogSize")
        @Validation(required = true)
        public Long logSize;

        public static ListValueAddedResponseValueAddedList build(java.util.Map<String, ?> map) throws Exception {
            ListValueAddedResponseValueAddedList self = new ListValueAddedResponseValueAddedList();
            return TeaModel.build(map, self);
        }

        public ListValueAddedResponseValueAddedList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListValueAddedResponseValueAddedList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListValueAddedResponseValueAddedList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListValueAddedResponseValueAddedList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListValueAddedResponseValueAddedList setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

    }

}
