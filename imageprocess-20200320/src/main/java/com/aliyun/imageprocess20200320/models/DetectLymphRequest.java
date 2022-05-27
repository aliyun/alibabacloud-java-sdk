// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLymphRequest extends TeaModel {
    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("URLList")
    public java.util.List<DetectLymphRequestURLList> URLList;

    public static DetectLymphRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectLymphRequest self = new DetectLymphRequest();
        return TeaModel.build(map, self);
    }

    public DetectLymphRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DetectLymphRequest setURLList(java.util.List<DetectLymphRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectLymphRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectLymphRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static DetectLymphRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectLymphRequestURLList self = new DetectLymphRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectLymphRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
