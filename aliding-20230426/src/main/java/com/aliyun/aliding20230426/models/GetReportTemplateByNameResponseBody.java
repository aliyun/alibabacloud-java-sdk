// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetReportTemplateByNameResponseBody extends TeaModel {
    @NameInMap("defaultReceivedConvs")
    public java.util.List<GetReportTemplateByNameResponseBodyDefaultReceivedConvs> defaultReceivedConvs;

    @NameInMap("defaultReceivers")
    public java.util.List<GetReportTemplateByNameResponseBodyDefaultReceivers> defaultReceivers;

    @NameInMap("fields")
    public java.util.List<GetReportTemplateByNameResponseBodyFields> fields;

    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("userName")
    public String userName;

    @NameInMap("userid")
    public String userid;

    public static GetReportTemplateByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReportTemplateByNameResponseBody self = new GetReportTemplateByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReportTemplateByNameResponseBody setDefaultReceivedConvs(java.util.List<GetReportTemplateByNameResponseBodyDefaultReceivedConvs> defaultReceivedConvs) {
        this.defaultReceivedConvs = defaultReceivedConvs;
        return this;
    }
    public java.util.List<GetReportTemplateByNameResponseBodyDefaultReceivedConvs> getDefaultReceivedConvs() {
        return this.defaultReceivedConvs;
    }

    public GetReportTemplateByNameResponseBody setDefaultReceivers(java.util.List<GetReportTemplateByNameResponseBodyDefaultReceivers> defaultReceivers) {
        this.defaultReceivers = defaultReceivers;
        return this;
    }
    public java.util.List<GetReportTemplateByNameResponseBodyDefaultReceivers> getDefaultReceivers() {
        return this.defaultReceivers;
    }

    public GetReportTemplateByNameResponseBody setFields(java.util.List<GetReportTemplateByNameResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<GetReportTemplateByNameResponseBodyFields> getFields() {
        return this.fields;
    }

    public GetReportTemplateByNameResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetReportTemplateByNameResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetReportTemplateByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetReportTemplateByNameResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public GetReportTemplateByNameResponseBody setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

    public static class GetReportTemplateByNameResponseBodyDefaultReceivedConvs extends TeaModel {
        @NameInMap("ConversationId")
        public String conversationId;

        @NameInMap("Title")
        public String title;

        public static GetReportTemplateByNameResponseBodyDefaultReceivedConvs build(java.util.Map<String, ?> map) throws Exception {
            GetReportTemplateByNameResponseBodyDefaultReceivedConvs self = new GetReportTemplateByNameResponseBodyDefaultReceivedConvs();
            return TeaModel.build(map, self);
        }

        public GetReportTemplateByNameResponseBodyDefaultReceivedConvs setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public GetReportTemplateByNameResponseBodyDefaultReceivedConvs setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetReportTemplateByNameResponseBodyDefaultReceivers extends TeaModel {
        @NameInMap("UserName")
        public String userName;

        @NameInMap("Userid")
        public String userid;

        public static GetReportTemplateByNameResponseBodyDefaultReceivers build(java.util.Map<String, ?> map) throws Exception {
            GetReportTemplateByNameResponseBodyDefaultReceivers self = new GetReportTemplateByNameResponseBodyDefaultReceivers();
            return TeaModel.build(map, self);
        }

        public GetReportTemplateByNameResponseBodyDefaultReceivers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetReportTemplateByNameResponseBodyDefaultReceivers setUserid(String userid) {
            this.userid = userid;
            return this;
        }
        public String getUserid() {
            return this.userid;
        }

    }

    public static class GetReportTemplateByNameResponseBodyFields extends TeaModel {
        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("Sort")
        public Long sort;

        @NameInMap("Type")
        public Long type;

        public static GetReportTemplateByNameResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            GetReportTemplateByNameResponseBodyFields self = new GetReportTemplateByNameResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public GetReportTemplateByNameResponseBodyFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetReportTemplateByNameResponseBodyFields setSort(Long sort) {
            this.sort = sort;
            return this;
        }
        public Long getSort() {
            return this.sort;
        }

        public GetReportTemplateByNameResponseBodyFields setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
