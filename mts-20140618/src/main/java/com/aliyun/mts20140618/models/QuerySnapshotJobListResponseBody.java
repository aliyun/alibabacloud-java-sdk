// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySnapshotJobListResponseBody extends TeaModel {
    @NameInMap("SnapshotJobList")
    public QuerySnapshotJobListResponseBodySnapshotJobList snapshotJobList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistSnapshotJobIds")
    public QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds nonExistSnapshotJobIds;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    public static QuerySnapshotJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySnapshotJobListResponseBody self = new QuerySnapshotJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySnapshotJobListResponseBody setSnapshotJobList(QuerySnapshotJobListResponseBodySnapshotJobList snapshotJobList) {
        this.snapshotJobList = snapshotJobList;
        return this;
    }
    public QuerySnapshotJobListResponseBodySnapshotJobList getSnapshotJobList() {
        return this.snapshotJobList;
    }

    public QuerySnapshotJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySnapshotJobListResponseBody setNonExistSnapshotJobIds(QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds nonExistSnapshotJobIds) {
        this.nonExistSnapshotJobIds = nonExistSnapshotJobIds;
        return this;
    }
    public QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds getNonExistSnapshotJobIds() {
        return this.nonExistSnapshotJobIds;
    }

    public QuerySnapshotJobListResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut extends TeaModel {
        @NameInMap("Padding")
        public String padding;

        @NameInMap("Color")
        public String color;

        @NameInMap("CellSelStep")
        public String cellSelStep;

        @NameInMap("CellHeight")
        public String cellHeight;

        @NameInMap("CellWidth")
        public String cellWidth;

        @NameInMap("Margin")
        public String margin;

        @NameInMap("Columns")
        public String columns;

        @NameInMap("IsKeepCellPic")
        public String isKeepCellPic;

        @NameInMap("Lines")
        public String lines;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setPadding(String padding) {
            this.padding = padding;
            return this;
        }
        public String getPadding() {
            return this.padding;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setCellSelStep(String cellSelStep) {
            this.cellSelStep = cellSelStep;
            return this;
        }
        public String getCellSelStep() {
            return this.cellSelStep;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setCellHeight(String cellHeight) {
            this.cellHeight = cellHeight;
            return this;
        }
        public String getCellHeight() {
            return this.cellHeight;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setCellWidth(String cellWidth) {
            this.cellWidth = cellWidth;
            return this;
        }
        public String getCellWidth() {
            return this.cellWidth;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut setMargin(String margin) {
            this.margin = margin;
            return this;
        }
        public String getMargin() {
            return this.margin;
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

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("TileOut")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut tileOut;

        @NameInMap("Interval")
        public String interval;

        @NameInMap("FrameType")
        public String frameType;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("OutputFile")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile outputFile;

        @NameInMap("Num")
        public String num;

        @NameInMap("TileOutputFile")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile tileOutputFile;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setTileOut(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut tileOut) {
            this.tileOut = tileOut;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut getTileOut() {
            return this.tileOut;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setFrameType(String frameType) {
            this.frameType = frameType;
            return this;
        }
        public String getFrameType() {
            return this.frameType;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setOutputFile(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setNum(String num) {
            this.num = num;
            return this;
        }
        public String getNum() {
            return this.num;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setTileOutputFile(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile tileOutputFile) {
            this.tileOutputFile = tileOutputFile;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile getTileOutputFile() {
            return this.tileOutputFile;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("SnapshotConfig")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig snapshotConfig;

        @NameInMap("State")
        public String state;

        @NameInMap("Message")
        public String message;

        @NameInMap("MNSMessageResult")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult MNSMessageResult;

        @NameInMap("Input")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput input;

        @NameInMap("Count")
        public String count;

        @NameInMap("TileCount")
        public String tileCount;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Code")
        public String code;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Id")
        public String id;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
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

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setMNSMessageResult(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setInput(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput input) {
            this.input = input;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput getInput() {
            return this.input;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
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

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

}
