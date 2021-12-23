// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ClusterFiguresRequest extends TeaModel {
    @NameInMap("CustomMessage")
    public String customMessage;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("FigureType")
    public String figureType;

    @NameInMap("NotifyTopicEndpoint")
    public String notifyTopicEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("ProjectName")
    public String projectName;

    public static ClusterFiguresRequest build(java.util.Map<String, ?> map) throws Exception {
        ClusterFiguresRequest self = new ClusterFiguresRequest();
        return TeaModel.build(map, self);
    }

    public ClusterFiguresRequest setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        return this;
    }
    public String getCustomMessage() {
        return this.customMessage;
    }

    public ClusterFiguresRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ClusterFiguresRequest setFigureType(String figureType) {
        this.figureType = figureType;
        return this;
    }
    public String getFigureType() {
        return this.figureType;
    }

    public ClusterFiguresRequest setNotifyTopicEndpoint(String notifyTopicEndpoint) {
        this.notifyTopicEndpoint = notifyTopicEndpoint;
        return this;
    }
    public String getNotifyTopicEndpoint() {
        return this.notifyTopicEndpoint;
    }

    public ClusterFiguresRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public ClusterFiguresRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
