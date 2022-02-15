// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServiceGroupMonitorSourceTemplatesResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<ListServiceGroupMonitorSourceTemplatesResponseBodyData> data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListServiceGroupMonitorSourceTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceGroupMonitorSourceTemplatesResponseBody self = new ListServiceGroupMonitorSourceTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceGroupMonitorSourceTemplatesResponseBody setData(java.util.List<ListServiceGroupMonitorSourceTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListServiceGroupMonitorSourceTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListServiceGroupMonitorSourceTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListServiceGroupMonitorSourceTemplatesResponseBodyData extends TeaModel {
        // 字段
        @NameInMap("fields")
        public java.util.List<String> fields;

        // 监控源ID
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        // 监控报警源名字
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        // 模板内容
        @NameInMap("templateContent")
        public String templateContent;

        // 消息模版ID
        @NameInMap("templateId")
        public Long templateId;

        public static ListServiceGroupMonitorSourceTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServiceGroupMonitorSourceTemplatesResponseBodyData self = new ListServiceGroupMonitorSourceTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServiceGroupMonitorSourceTemplatesResponseBodyData setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public ListServiceGroupMonitorSourceTemplatesResponseBodyData setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public ListServiceGroupMonitorSourceTemplatesResponseBodyData setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public ListServiceGroupMonitorSourceTemplatesResponseBodyData setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public ListServiceGroupMonitorSourceTemplatesResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
