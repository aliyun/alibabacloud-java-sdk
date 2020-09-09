// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectCovid19CadRequest extends TeaModel {
    @NameInMap("URLList")
    @Validation(required = true)
    public java.util.List<DetectCovid19CadRequestURLList> URLList;

    public static DetectCovid19CadRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectCovid19CadRequest self = new DetectCovid19CadRequest();
        return TeaModel.build(map, self);
    }

    public DetectCovid19CadRequest setURLList(java.util.List<DetectCovid19CadRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectCovid19CadRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectCovid19CadRequestURLList extends TeaModel {
        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        public static DetectCovid19CadRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectCovid19CadRequestURLList self = new DetectCovid19CadRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectCovid19CadRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
