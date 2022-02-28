// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServiceDependencyStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Entries")
    public DescribeServiceDependencyStatusResponseBodyEntries entries;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeServiceDependencyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceDependencyStatusResponseBody self = new DescribeServiceDependencyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceDependencyStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeServiceDependencyStatusResponseBody setEntries(DescribeServiceDependencyStatusResponseBodyEntries entries) {
        this.entries = entries;
        return this;
    }
    public DescribeServiceDependencyStatusResponseBodyEntries getEntries() {
        return this.entries;
    }

    public DescribeServiceDependencyStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeServiceDependencyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceDependencyStatusResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public DescribeServiceDependencyStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeServiceDependencyStatusResponseBodyEntriesEntry extends TeaModel {
        @NameInMap("CheckItem")
        public String checkItem;

        @NameInMap("Description")
        public Boolean description;

        @NameInMap("Internal")
        public Boolean internal;

        public static DescribeServiceDependencyStatusResponseBodyEntriesEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceDependencyStatusResponseBodyEntriesEntry self = new DescribeServiceDependencyStatusResponseBodyEntriesEntry();
            return TeaModel.build(map, self);
        }

        public DescribeServiceDependencyStatusResponseBodyEntriesEntry setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeServiceDependencyStatusResponseBodyEntriesEntry setDescription(Boolean description) {
            this.description = description;
            return this;
        }
        public Boolean getDescription() {
            return this.description;
        }

        public DescribeServiceDependencyStatusResponseBodyEntriesEntry setInternal(Boolean internal) {
            this.internal = internal;
            return this;
        }
        public Boolean getInternal() {
            return this.internal;
        }

    }

    public static class DescribeServiceDependencyStatusResponseBodyEntries extends TeaModel {
        @NameInMap("entry")
        public java.util.List<DescribeServiceDependencyStatusResponseBodyEntriesEntry> entry;

        public static DescribeServiceDependencyStatusResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceDependencyStatusResponseBodyEntries self = new DescribeServiceDependencyStatusResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public DescribeServiceDependencyStatusResponseBodyEntries setEntry(java.util.List<DescribeServiceDependencyStatusResponseBodyEntriesEntry> entry) {
            this.entry = entry;
            return this;
        }
        public java.util.List<DescribeServiceDependencyStatusResponseBodyEntriesEntry> getEntry() {
            return this.entry;
        }

    }

}
