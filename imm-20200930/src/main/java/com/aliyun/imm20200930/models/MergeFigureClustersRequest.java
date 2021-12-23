// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class MergeFigureClustersRequest extends TeaModel {
    @NameInMap("ClusterIdFrom")
    public String clusterIdFrom;

    @NameInMap("ClusterIdTo")
    public String clusterIdTo;

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

    public static MergeFigureClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeFigureClustersRequest self = new MergeFigureClustersRequest();
        return TeaModel.build(map, self);
    }

    public MergeFigureClustersRequest setClusterIdFrom(String clusterIdFrom) {
        this.clusterIdFrom = clusterIdFrom;
        return this;
    }
    public String getClusterIdFrom() {
        return this.clusterIdFrom;
    }

    public MergeFigureClustersRequest setClusterIdTo(String clusterIdTo) {
        this.clusterIdTo = clusterIdTo;
        return this;
    }
    public String getClusterIdTo() {
        return this.clusterIdTo;
    }

    public MergeFigureClustersRequest setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        return this;
    }
    public String getCustomMessage() {
        return this.customMessage;
    }

    public MergeFigureClustersRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public MergeFigureClustersRequest setFigureType(String figureType) {
        this.figureType = figureType;
        return this;
    }
    public String getFigureType() {
        return this.figureType;
    }

    public MergeFigureClustersRequest setNotifyTopicEndpoint(String notifyTopicEndpoint) {
        this.notifyTopicEndpoint = notifyTopicEndpoint;
        return this;
    }
    public String getNotifyTopicEndpoint() {
        return this.notifyTopicEndpoint;
    }

    public MergeFigureClustersRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public MergeFigureClustersRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
