// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAutomateResponseConfigPlayBooksResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAutomateResponseConfigPlayBooksResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAutomateResponseConfigPlayBooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomateResponseConfigPlayBooksResponseBody self = new DescribeAutomateResponseConfigPlayBooksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutomateResponseConfigPlayBooksResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAutomateResponseConfigPlayBooksResponseBody setData(java.util.List<DescribeAutomateResponseConfigPlayBooksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAutomateResponseConfigPlayBooksResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAutomateResponseConfigPlayBooksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAutomateResponseConfigPlayBooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutomateResponseConfigPlayBooksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAutomateResponseConfigPlayBooksResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParamType")
        public String paramType;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeAutomateResponseConfigPlayBooksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutomateResponseConfigPlayBooksResponseBodyData self = new DescribeAutomateResponseConfigPlayBooksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAutomateResponseConfigPlayBooksResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAutomateResponseConfigPlayBooksResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeAutomateResponseConfigPlayBooksResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAutomateResponseConfigPlayBooksResponseBodyData setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public DescribeAutomateResponseConfigPlayBooksResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
