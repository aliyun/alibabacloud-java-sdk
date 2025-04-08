// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetDoctorApplicationResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetDoctorApplicationResponseBodyData data;

    public static GetDoctorApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorApplicationResponseBody self = new GetDoctorApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDoctorApplicationResponseBody setData(GetDoctorApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDoctorApplicationResponseBodyData getData() {
        return this.data;
    }

    public static class GetDoctorApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The diagnostics list.</p>
         */
        @NameInMap("suggestions")
        public java.util.List<String> suggestions;

        public static GetDoctorApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDoctorApplicationResponseBodyData self = new GetDoctorApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDoctorApplicationResponseBodyData setSuggestions(java.util.List<String> suggestions) {
            this.suggestions = suggestions;
            return this;
        }
        public java.util.List<String> getSuggestions() {
            return this.suggestions;
        }

    }

}
