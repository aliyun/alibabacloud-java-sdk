// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryRobotUnsubscriptionRequest extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SceneCode")
    public String sceneCode;

    public static QueryRobotUnsubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotUnsubscriptionRequest self = new QueryRobotUnsubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public QueryRobotUnsubscriptionRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryRobotUnsubscriptionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRobotUnsubscriptionRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public QueryRobotUnsubscriptionRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
