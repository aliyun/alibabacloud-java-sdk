// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcCACSRequest extends TeaModel {
    @NameInMap("Async")
    public Boolean async;

    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("URLList")
    public java.util.List<CalcCACSRequestURLList> URLList;

    public static CalcCACSRequest build(java.util.Map<String, ?> map) throws Exception {
        CalcCACSRequest self = new CalcCACSRequest();
        return TeaModel.build(map, self);
    }

    public CalcCACSRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public CalcCACSRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public CalcCACSRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public CalcCACSRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CalcCACSRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CalcCACSRequest setURLList(java.util.List<CalcCACSRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<CalcCACSRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class CalcCACSRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        public static CalcCACSRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            CalcCACSRequestURLList self = new CalcCACSRequestURLList();
            return TeaModel.build(map, self);
        }

        public CalcCACSRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
