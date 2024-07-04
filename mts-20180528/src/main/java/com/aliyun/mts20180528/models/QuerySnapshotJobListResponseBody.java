// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QuerySnapshotJobListResponseBody extends TeaModel {
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("NonExistSnapshotJobIds")
    public QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds nonExistSnapshotJobIds;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotJobList")
    public QuerySnapshotJobListResponseBodySnapshotJobList snapshotJobList;

    public static QuerySnapshotJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySnapshotJobListResponseBody self = new QuerySnapshotJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySnapshotJobListResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QuerySnapshotJobListResponseBody setNonExistSnapshotJobIds(QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds nonExistSnapshotJobIds) {
        this.nonExistSnapshotJobIds = nonExistSnapshotJobIds;
        return this;
    }
    public QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds getNonExistSnapshotJobIds() {
        return this.nonExistSnapshotJobIds;
    }

    public QuerySnapshotJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySnapshotJobListResponseBody setSnapshotJobList(QuerySnapshotJobListResponseBodySnapshotJobList snapshotJobList) {
        this.snapshotJobList = snapshotJobList;
        return this;
    }
    public QuerySnapshotJobListResponseBodySnapshotJobList getSnapshotJobList() {
        return this.snapshotJobList;
    }

    public static class QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds self = new QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("MessageId")
        public String messageId;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut extends TeaModel {
        @NameInMap("CellHeight")
        public String cellHeight;

        @NameInMap("CellSelStep")
        public String cellSelStep;

        @NameInMap("CellWidth")
        public String cellWidth;

        @NameInMap("Color")
        public String color;

        @NameInMap("Columns")
        public String columns;

        @NameInMap("IsKeepCellPic")
        public String isKeepCellPic;

        @NameInMap("Lines")
        public String lines;

        @NameInMap("Margin")
        public String margin;

        @NameInMap("Padding")
        public String padding;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setCellHeight(String cellHeight) {
            this.cellHeight = cellHeight;
            return this;
        }
        public String getCellHeight() {
            return this.cellHeight;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setCellSelStep(String cellSelStep) {
            this.cellSelStep = cellSelStep;
            return this;
        }
        public String getCellSelStep() {
            return this.cellSelStep;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setCellWidth(String cellWidth) {
            this.cellWidth = cellWidth;
            return this;
        }
        public String getCellWidth() {
            return this.cellWidth;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setColumns(String columns) {
            this.columns = columns;
            return this;
        }
        public String getColumns() {
            return this.columns;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setIsKeepCellPic(String isKeepCellPic) {
            this.isKeepCellPic = isKeepCellPic;
            return this;
        }
        public String getIsKeepCellPic() {
            return this.isKeepCellPic;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setLines(String lines) {
            this.lines = lines;
            return this;
        }
        public String getLines() {
            return this.lines;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setMargin(String margin) {
            this.margin = margin;
            return this;
        }
        public String getMargin() {
            return this.margin;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setPadding(String padding) {
            this.padding = padding;
            return this;
        }
        public String getPadding() {
            return this.padding;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig extends TeaModel {
        @NameInMap("FrameType")
        public String frameType;

        @NameInMap("Height")
        public String height;

        @NameInMap("Interval")
        public String interval;

        @NameInMap("Num")
        public String num;

        @NameInMap("OutputFile")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile outputFile;

        @NameInMap("TileOut")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut tileOut;

        @NameInMap("TileOutputFile")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile tileOutputFile;

        @NameInMap("Time")
        public String time;

        @NameInMap("Width")
        public String width;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setFrameType(String frameType) {
            this.frameType = frameType;
            return this;
        }
        public String getFrameType() {
            return this.frameType;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setNum(String num) {
            this.num = num;
            return this;
        }
        public String getNum() {
            return this.num;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setOutputFile(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setTileOut(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut tileOut) {
            this.tileOut = tileOut;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut getTileOut() {
            return this.tileOut;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setTileOutputFile(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile tileOutputFile) {
            this.tileOutputFile = tileOutputFile;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile getTileOutputFile() {
            return this.tileOutputFile;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Count")
        public String count;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput input;

        @NameInMap("MNSMessageResult")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult MNSMessageResult;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("SnapshotConfig")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig snapshotConfig;

        @NameInMap("State")
        public String state;

        @NameInMap("TileCount")
        public String tileCount;

        @NameInMap("UserData")
        public String userData;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setInput(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput input) {
            this.input = input;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput getInput() {
            return this.input;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setMNSMessageResult(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setSnapshotConfig(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig snapshotConfig) {
            this.snapshotConfig = snapshotConfig;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig getSnapshotConfig() {
            return this.snapshotConfig;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setTileCount(String tileCount) {
            this.tileCount = tileCount;
            return this;
        }
        public String getTileCount() {
            return this.tileCount;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobList extends TeaModel {
        @NameInMap("SnapshotJob")
        public java.util.List<QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob> snapshotJob;

        public static QuerySnapshotJobListResponseBodySnapshotJobList build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobList self = new QuerySnapshotJobListResponseBodySnapshotJobList();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobList setSnapshotJob(java.util.List<QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob> snapshotJob) {
            this.snapshotJob = snapshotJob;
            return this;
        }
        public java.util.List<QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob> getSnapshotJob() {
            return this.snapshotJob;
        }

    }

}
