// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class FixServiceDependencyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Entries")
    public FixServiceDependencyResponseBodyEntries entries;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("Success")
    public Boolean success;

    public static FixServiceDependencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FixServiceDependencyResponseBody self = new FixServiceDependencyResponseBody();
        return TeaModel.build(map, self);
    }

    public FixServiceDependencyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FixServiceDependencyResponseBody setEntries(FixServiceDependencyResponseBodyEntries entries) {
        this.entries = entries;
        return this;
    }
    public FixServiceDependencyResponseBodyEntries getEntries() {
        return this.entries;
    }

    public FixServiceDependencyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FixServiceDependencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FixServiceDependencyResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public FixServiceDependencyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FixServiceDependencyResponseBodyEntriesEntry extends TeaModel {
        @NameInMap("CheckItem")
        public String checkItem;

        @NameInMap("Description")
        public Boolean description;

        @NameInMap("Internal")
        public Boolean internal;

        public static FixServiceDependencyResponseBodyEntriesEntry build(java.util.Map<String, ?> map) throws Exception {
            FixServiceDependencyResponseBodyEntriesEntry self = new FixServiceDependencyResponseBodyEntriesEntry();
            return TeaModel.build(map, self);
        }

        public FixServiceDependencyResponseBodyEntriesEntry setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public FixServiceDependencyResponseBodyEntriesEntry setDescription(Boolean description) {
            this.description = description;
            return this;
        }
        public Boolean getDescription() {
            return this.description;
        }

        public FixServiceDependencyResponseBodyEntriesEntry setInternal(Boolean internal) {
            this.internal = internal;
            return this;
        }
        public Boolean getInternal() {
            return this.internal;
        }

    }

    public static class FixServiceDependencyResponseBodyEntries extends TeaModel {
        @NameInMap("entry")
        public java.util.List<FixServiceDependencyResponseBodyEntriesEntry> entry;

        public static FixServiceDependencyResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            FixServiceDependencyResponseBodyEntries self = new FixServiceDependencyResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public FixServiceDependencyResponseBodyEntries setEntry(java.util.List<FixServiceDependencyResponseBodyEntriesEntry> entry) {
            this.entry = entry;
            return this;
        }
        public java.util.List<FixServiceDependencyResponseBodyEntriesEntry> getEntry() {
            return this.entry;
        }

    }

}
