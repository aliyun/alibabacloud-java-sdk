// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CountCrowdResponseBody extends TeaModel {
    @NameInMap("Data")
    public CountCrowdResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CountCrowdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountCrowdResponseBody self = new CountCrowdResponseBody();
        return TeaModel.build(map, self);
    }

    public CountCrowdResponseBody setData(CountCrowdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CountCrowdResponseBodyData getData() {
        return this.data;
    }

    public CountCrowdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CountCrowdResponseBodyData extends TeaModel {
        @NameInMap("HotMap")
        public String hotMap;

        @NameInMap("PeopleNumber")
        public Integer peopleNumber;

        public static CountCrowdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CountCrowdResponseBodyData self = new CountCrowdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CountCrowdResponseBodyData setHotMap(String hotMap) {
            this.hotMap = hotMap;
            return this;
        }
        public String getHotMap() {
            return this.hotMap;
        }

        public CountCrowdResponseBodyData setPeopleNumber(Integer peopleNumber) {
            this.peopleNumber = peopleNumber;
            return this;
        }
        public Integer getPeopleNumber() {
            return this.peopleNumber;
        }

    }

}
