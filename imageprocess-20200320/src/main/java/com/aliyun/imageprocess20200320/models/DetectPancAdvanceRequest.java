// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectPancAdvanceRequest extends TeaModel {
    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("URLList")
    public java.util.List<DetectPancAdvanceRequestURLList> URLList;

    public static DetectPancAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectPancAdvanceRequest self = new DetectPancAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectPancAdvanceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DetectPancAdvanceRequest setURLList(java.util.List<DetectPancAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectPancAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectPancAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        public static DetectPancAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectPancAdvanceRequestURLList self = new DetectPancAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectPancAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

    }

}
