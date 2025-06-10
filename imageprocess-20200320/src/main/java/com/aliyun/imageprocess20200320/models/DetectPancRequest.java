// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectPancRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP_FILES</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("URLList")
    public java.util.List<DetectPancRequestURLList> URLList;

    public static DetectPancRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectPancRequest self = new DetectPancRequest();
        return TeaModel.build(map, self);
    }

    public DetectPancRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DetectPancRequest setURLList(java.util.List<DetectPancRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectPancRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectPancRequestURLList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("URL")
        public String URL;

        public static DetectPancRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectPancRequestURLList self = new DetectPancRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectPancRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
