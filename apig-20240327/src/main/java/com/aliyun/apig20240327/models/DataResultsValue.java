// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DataResultsValue extends TeaModel {
    @NameInMap("routeId")
    public String routeId;

    @NameInMap("status")
    public String status;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("skipReason")
    public String skipReason;

    public static DataResultsValue build(java.util.Map<String, ?> map) throws Exception {
        DataResultsValue self = new DataResultsValue();
        return TeaModel.build(map, self);
    }

    public DataResultsValue setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public DataResultsValue setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DataResultsValue setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DataResultsValue setSkipReason(String skipReason) {
        this.skipReason = skipReason;
        return this;
    }
    public String getSkipReason() {
        return this.skipReason;
    }

}
