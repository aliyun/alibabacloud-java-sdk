// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CountCrowdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public CountCrowdResponseData data;

    public static CountCrowdResponse build(java.util.Map<String, ?> map) throws Exception {
        CountCrowdResponse self = new CountCrowdResponse();
        return TeaModel.build(map, self);
    }

    public CountCrowdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountCrowdResponse setData(CountCrowdResponseData data) {
        this.data = data;
        return this;
    }
    public CountCrowdResponseData getData() {
        return this.data;
    }

    public static class CountCrowdResponseData extends TeaModel {
        @NameInMap("PeopleNumber")
        @Validation(required = true)
        public Integer peopleNumber;

        @NameInMap("HotMap")
        @Validation(required = true)
        public String hotMap;

        public static CountCrowdResponseData build(java.util.Map<String, ?> map) throws Exception {
            CountCrowdResponseData self = new CountCrowdResponseData();
            return TeaModel.build(map, self);
        }

        public CountCrowdResponseData setPeopleNumber(Integer peopleNumber) {
            this.peopleNumber = peopleNumber;
            return this;
        }
        public Integer getPeopleNumber() {
            return this.peopleNumber;
        }

        public CountCrowdResponseData setHotMap(String hotMap) {
            this.hotMap = hotMap;
            return this;
        }
        public String getHotMap() {
            return this.hotMap;
        }

    }

}
