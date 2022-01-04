// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetStatisticsRequest extends TeaModel {
    @NameInMap("singleIndicatorList")
    public java.util.List<GetStatisticsRequestSingleIndicatorList> singleIndicatorList;

    public static GetStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStatisticsRequest self = new GetStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetStatisticsRequest setSingleIndicatorList(java.util.List<GetStatisticsRequestSingleIndicatorList> singleIndicatorList) {
        this.singleIndicatorList = singleIndicatorList;
        return this;
    }
    public java.util.List<GetStatisticsRequestSingleIndicatorList> getSingleIndicatorList() {
        return this.singleIndicatorList;
    }

    public static class GetStatisticsRequestSingleIndicatorList extends TeaModel {
        @NameInMap("indicatorCode")
        public String indicatorCode;

        @NameInMap("indicatorTypes")
        public java.util.List<String> indicatorTypes;

        public static GetStatisticsRequestSingleIndicatorList build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsRequestSingleIndicatorList self = new GetStatisticsRequestSingleIndicatorList();
            return TeaModel.build(map, self);
        }

        public GetStatisticsRequestSingleIndicatorList setIndicatorCode(String indicatorCode) {
            this.indicatorCode = indicatorCode;
            return this;
        }
        public String getIndicatorCode() {
            return this.indicatorCode;
        }

        public GetStatisticsRequestSingleIndicatorList setIndicatorTypes(java.util.List<String> indicatorTypes) {
            this.indicatorTypes = indicatorTypes;
            return this;
        }
        public java.util.List<String> getIndicatorTypes() {
            return this.indicatorTypes;
        }

    }

}
