// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLymphAdvanceRequest extends TeaModel {
    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("URLList")
    public java.util.List<DetectLymphAdvanceRequestURLList> URLList;

    public static DetectLymphAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectLymphAdvanceRequest self = new DetectLymphAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectLymphAdvanceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DetectLymphAdvanceRequest setURLList(java.util.List<DetectLymphAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectLymphAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectLymphAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static DetectLymphAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectLymphAdvanceRequestURLList self = new DetectLymphAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectLymphAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
