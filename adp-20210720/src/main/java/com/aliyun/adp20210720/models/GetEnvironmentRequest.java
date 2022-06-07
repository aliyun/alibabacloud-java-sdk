// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentRequest extends TeaModel {
    @NameInMap("options")
    public GetEnvironmentRequestOptions options;

    public static GetEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentRequest self = new GetEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentRequest setOptions(GetEnvironmentRequestOptions options) {
        this.options = options;
        return this;
    }
    public GetEnvironmentRequestOptions getOptions() {
        return this.options;
    }

    public static class GetEnvironmentRequestOptions extends TeaModel {
        @NameInMap("withSiteSurveyReport")
        public Boolean withSiteSurveyReport;

        public static GetEnvironmentRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentRequestOptions self = new GetEnvironmentRequestOptions();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentRequestOptions setWithSiteSurveyReport(Boolean withSiteSurveyReport) {
            this.withSiteSurveyReport = withSiteSurveyReport;
            return this;
        }
        public Boolean getWithSiteSurveyReport() {
            return this.withSiteSurveyReport;
        }

    }

}
