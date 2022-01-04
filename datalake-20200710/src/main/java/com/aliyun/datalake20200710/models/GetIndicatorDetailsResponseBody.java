// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetIndicatorDetailsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetIndicatorDetailsResponseBodyData> data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetIndicatorDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIndicatorDetailsResponseBody self = new GetIndicatorDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIndicatorDetailsResponseBody setData(java.util.List<GetIndicatorDetailsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetIndicatorDetailsResponseBodyData> getData() {
        return this.data;
    }

    public GetIndicatorDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIndicatorDetailsResponseBodyDataIndicatorStatistic extends TeaModel {
        @NameInMap("data")
        public Long data;

        @NameInMap("date")
        public String date;

        public static GetIndicatorDetailsResponseBodyDataIndicatorStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetIndicatorDetailsResponseBodyDataIndicatorStatistic self = new GetIndicatorDetailsResponseBodyDataIndicatorStatistic();
            return TeaModel.build(map, self);
        }

        public GetIndicatorDetailsResponseBodyDataIndicatorStatistic setData(Long data) {
            this.data = data;
            return this;
        }
        public Long getData() {
            return this.data;
        }

        public GetIndicatorDetailsResponseBodyDataIndicatorStatistic setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class GetIndicatorDetailsResponseBodyData extends TeaModel {
        @NameInMap("IndicatorStatistic")
        public GetIndicatorDetailsResponseBodyDataIndicatorStatistic indicatorStatistic;

        public static GetIndicatorDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIndicatorDetailsResponseBodyData self = new GetIndicatorDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIndicatorDetailsResponseBodyData setIndicatorStatistic(GetIndicatorDetailsResponseBodyDataIndicatorStatistic indicatorStatistic) {
            this.indicatorStatistic = indicatorStatistic;
            return this;
        }
        public GetIndicatorDetailsResponseBodyDataIndicatorStatistic getIndicatorStatistic() {
            return this.indicatorStatistic;
        }

    }

}
