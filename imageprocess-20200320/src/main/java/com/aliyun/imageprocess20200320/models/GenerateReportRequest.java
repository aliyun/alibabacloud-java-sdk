// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class GenerateReportRequest extends TeaModel {
    @NameInMap("ReportConfigs")
    public java.util.List<GenerateReportRequestReportConfigs> reportConfigs;

    public static GenerateReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateReportRequest self = new GenerateReportRequest();
        return TeaModel.build(map, self);
    }

    public GenerateReportRequest setReportConfigs(java.util.List<GenerateReportRequestReportConfigs> reportConfigs) {
        this.reportConfigs = reportConfigs;
        return this;
    }
    public java.util.List<GenerateReportRequestReportConfigs> getReportConfigs() {
        return this.reportConfigs;
    }

    public static class GenerateReportRequestReportConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CalcBMD</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <strong>example:</strong>
         * <p>dark</p>
         */
        @NameInMap("Theme")
        public String theme;

        public static GenerateReportRequestReportConfigs build(java.util.Map<String, ?> map) throws Exception {
            GenerateReportRequestReportConfigs self = new GenerateReportRequestReportConfigs();
            return TeaModel.build(map, self);
        }

        public GenerateReportRequestReportConfigs setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GenerateReportRequestReportConfigs setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GenerateReportRequestReportConfigs setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public GenerateReportRequestReportConfigs setTheme(String theme) {
            this.theme = theme;
            return this;
        }
        public String getTheme() {
            return this.theme;
        }

    }

}
