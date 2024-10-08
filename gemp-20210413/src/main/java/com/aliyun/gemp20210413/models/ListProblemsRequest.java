// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("affectServiceId")
    public Long affectServiceId;

    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>2020-03-05 15:50:59</p>
     */
    @NameInMap("discoveryEndTime")
    public String discoveryEndTime;

    /**
     * <strong>example:</strong>
     * <p>2020-03-05 15:50:59</p>
     */
    @NameInMap("discoveryStartTime")
    public String discoveryStartTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("mainHandlerId")
    public Long mainHandlerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>P2</p>
     */
    @NameInMap("problemLevel")
    public String problemLevel;

    /**
     * <strong>example:</strong>
     * <p>HANDLING</p>
     */
    @NameInMap("problemStatus")
    public String problemStatus;

    /**
     * <strong>example:</strong>
     * <p>RESPONSIBLE</p>
     */
    @NameInMap("queryType")
    public String queryType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("repeaterId")
    public Long repeaterId;

    /**
     * <strong>example:</strong>
     * <p>2020-03-05 15:50:59</p>
     */
    @NameInMap("restoreEndTime")
    public String restoreEndTime;

    /**
     * <strong>example:</strong>
     * <p>2020-03-05 15:50:59</p>
     */
    @NameInMap("restoreStartTime")
    public String restoreStartTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static ListProblemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProblemsRequest self = new ListProblemsRequest();
        return TeaModel.build(map, self);
    }

    public ListProblemsRequest setAffectServiceId(Long affectServiceId) {
        this.affectServiceId = affectServiceId;
        return this;
    }
    public Long getAffectServiceId() {
        return this.affectServiceId;
    }

    public ListProblemsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListProblemsRequest setDiscoveryEndTime(String discoveryEndTime) {
        this.discoveryEndTime = discoveryEndTime;
        return this;
    }
    public String getDiscoveryEndTime() {
        return this.discoveryEndTime;
    }

    public ListProblemsRequest setDiscoveryStartTime(String discoveryStartTime) {
        this.discoveryStartTime = discoveryStartTime;
        return this;
    }
    public String getDiscoveryStartTime() {
        return this.discoveryStartTime;
    }

    public ListProblemsRequest setMainHandlerId(Long mainHandlerId) {
        this.mainHandlerId = mainHandlerId;
        return this;
    }
    public Long getMainHandlerId() {
        return this.mainHandlerId;
    }

    public ListProblemsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListProblemsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListProblemsRequest setProblemLevel(String problemLevel) {
        this.problemLevel = problemLevel;
        return this;
    }
    public String getProblemLevel() {
        return this.problemLevel;
    }

    public ListProblemsRequest setProblemStatus(String problemStatus) {
        this.problemStatus = problemStatus;
        return this;
    }
    public String getProblemStatus() {
        return this.problemStatus;
    }

    public ListProblemsRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListProblemsRequest setRepeaterId(Long repeaterId) {
        this.repeaterId = repeaterId;
        return this;
    }
    public Long getRepeaterId() {
        return this.repeaterId;
    }

    public ListProblemsRequest setRestoreEndTime(String restoreEndTime) {
        this.restoreEndTime = restoreEndTime;
        return this;
    }
    public String getRestoreEndTime() {
        return this.restoreEndTime;
    }

    public ListProblemsRequest setRestoreStartTime(String restoreStartTime) {
        this.restoreStartTime = restoreStartTime;
        return this;
    }
    public String getRestoreStartTime() {
        return this.restoreStartTime;
    }

    public ListProblemsRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
