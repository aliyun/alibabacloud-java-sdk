// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CheckServiceHealthRequest extends TeaModel {
    // data
    @NameInMap("data")
    public CheckServiceHealthRequestData data;

    public static CheckServiceHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceHealthRequest self = new CheckServiceHealthRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceHealthRequest setData(CheckServiceHealthRequestData data) {
        this.data = data;
        return this;
    }
    public CheckServiceHealthRequestData getData() {
        return this.data;
    }

    public static class CheckServiceHealthRequestData extends TeaModel {
        // id
        @NameInMap("id")
        public Long id;

        // operationIds
        @NameInMap("operationIds")
        public java.util.List<Long> operationIds;

        public static CheckServiceHealthRequestData build(java.util.Map<String, ?> map) throws Exception {
            CheckServiceHealthRequestData self = new CheckServiceHealthRequestData();
            return TeaModel.build(map, self);
        }

        public CheckServiceHealthRequestData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CheckServiceHealthRequestData setOperationIds(java.util.List<Long> operationIds) {
            this.operationIds = operationIds;
            return this;
        }
        public java.util.List<Long> getOperationIds() {
            return this.operationIds;
        }

    }

}
