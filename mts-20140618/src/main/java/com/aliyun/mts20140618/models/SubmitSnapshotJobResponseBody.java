// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotJob")
    public SubmitSnapshotJobResponseBodySnapshotJob snapshotJob;

    public static SubmitSnapshotJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobResponseBody self = new SubmitSnapshotJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSnapshotJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSnapshotJobResponseBody setSnapshotJob(SubmitSnapshotJobResponseBodySnapshotJob snapshotJob) {
        this.snapshotJob = snapshotJob;
        return this;
    }
    public SubmitSnapshotJobResponseBodySnapshotJob getSnapshotJob() {
        return this.snapshotJob;
    }

    public static class SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut extends TeaModel {
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

        public static SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut self = new SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setPadding(String padding) {
            this.padding = padding;
            return this;
        }
        public String getPadding() {
            return this.padding;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setCellSelStep(String cellSelStep) {
            this.cellSelStep = cellSelStep;
            return this;
        }
        public String getCellSelStep() {
            return this.cellSelStep;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setCellHeight(String cellHeight) {
            this.cellHeight = cellHeight;
            return this;
        }
        public String getCellHeight() {
            return this.cellHeight;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setCellWidth(String cellWidth) {
            this.cellWidth = cellWidth;
            return this;
        }
        public String getCellWidth() {
            return this.cellWidth;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setMargin(String margin) {
            this.margin = margin;
            return this;
        }
        public String getMargin() {
            return this.margin;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setColumns(String columns) {
            this.columns = columns;
            return this;
        }
        public String getColumns() {
            return this.columns;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setIsKeepCellPic(String isKeepCellPic) {
            this.isKeepCellPic = isKeepCellPic;
            return this;
        }
        public String getIsKeepCellPic() {
            return this.isKeepCellPic;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setLines(String lines) {
            this.lines = lines;
            return this;
        }
        public String getLines() {
            return this.lines;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile self = new SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile self = new SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("TileOut")
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut tileOut;

        @NameInMap("Interval")
        public String interval;

        @NameInMap("FrameType")
        public String frameType;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("OutputFile")
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile outputFile;

        @NameInMap("Num")
        public String num;

        @NameInMap("TileOutputFile")
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile tileOutputFile;

        public static SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig self = new SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setTileOut(SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut tileOut) {
            this.tileOut = tileOut;
            return this;
        }
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut getTileOut() {
            return this.tileOut;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setFrameType(String frameType) {
            this.frameType = frameType;
            return this;
        }
        public String getFrameType() {
            return this.frameType;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setOutputFile(SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setNum(String num) {
            this.num = num;
            return this;
        }
        public String getNum() {
            return this.num;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setTileOutputFile(SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile tileOutputFile) {
            this.tileOutputFile = tileOutputFile;
            return this;
        }
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile getTileOutputFile() {
            return this.tileOutputFile;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult self = new SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJobInput extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitSnapshotJobResponseBodySnapshotJobInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobInput self = new SubmitSnapshotJobResponseBodySnapshotJobInput();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobInput setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("SnapshotConfig")
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig snapshotConfig;

        @NameInMap("State")
        public String state;

        @NameInMap("Message")
        public String message;

        @NameInMap("MNSMessageResult")
        public SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult MNSMessageResult;

        @NameInMap("Input")
        public SubmitSnapshotJobResponseBodySnapshotJobInput input;

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

        public static SubmitSnapshotJobResponseBodySnapshotJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJob self = new SubmitSnapshotJobResponseBodySnapshotJob();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setSnapshotConfig(SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig snapshotConfig) {
            this.snapshotConfig = snapshotConfig;
            return this;
        }
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig getSnapshotConfig() {
            return this.snapshotConfig;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setMNSMessageResult(SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setInput(SubmitSnapshotJobResponseBodySnapshotJobInput input) {
            this.input = input;
            return this;
        }
        public SubmitSnapshotJobResponseBodySnapshotJobInput getInput() {
            return this.input;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setTileCount(String tileCount) {
            this.tileCount = tileCount;
            return this;
        }
        public String getTileCount() {
            return this.tileCount;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
