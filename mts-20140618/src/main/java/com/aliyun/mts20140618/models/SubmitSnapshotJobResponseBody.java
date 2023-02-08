// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the snapshot job.</p>
     */
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

    public static class SubmitSnapshotJobResponseBodySnapshotJobInput extends TeaModel {
        /**
         * <p>The OSS bucket that stores the object.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the region in which the OSS bucket that stores the object is located.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The OSS object that is used as the input file.</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The ARN of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        public static SubmitSnapshotJobResponseBodySnapshotJobInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobInput self = new SubmitSnapshotJobResponseBodySnapshotJobInput();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobInput setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult extends TeaModel {
        /**
         * <p>The error code returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the message. This parameter is not returned if the job fails.</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        public static SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult self = new SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile extends TeaModel {
        /**
         * <p>The OSS bucket that stores the object.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the region in which the OSS bucket that stores the object is located.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The OSS object that is generated as the output file of the snapshot job.</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        public static SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile self = new SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut extends TeaModel {
        /**
         * <p>The height of a single image. The default value is the height of a captured snapshot.</p>
         */
        @NameInMap("CellHeight")
        public String cellHeight;

        /**
         * <p>The stride of a single image.</p>
         */
        @NameInMap("CellSelStep")
        public String cellSelStep;

        /**
         * <p>The width of a single image. The default value is the width of a captured snapshot.</p>
         */
        @NameInMap("CellWidth")
        public String cellWidth;

        /**
         * <p>The background color.</p>
         * <br>
         * <p>*   Default value: **black**.</p>
         * <p>*   You can set the Color parameter to a **color keyword** or **random** in the request.</p>
         * <br>
         * <p>>  If you want to set the background color to black, you can specify the color keyword in one of the following three formats: Black, black, and #000000.</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The number of columns that the tiled image contains. Default value: **10**.</p>
         */
        @NameInMap("Columns")
        public String columns;

        /**
         * <p>Indicates whether the single images are retained. Valid values:</p>
         * <br>
         * <p>*   **true**: The single images are retained.</p>
         * <p>*   **false**: The single images are not retained.</p>
         * <p>*   Default value: **true**.</p>
         */
        @NameInMap("IsKeepCellPic")
        public String isKeepCellPic;

        /**
         * <p>The number of rows that the tiled image contains. Default value: **10**.</p>
         */
        @NameInMap("Lines")
        public String lines;

        /**
         * <p>The margin width of the tiled image.</p>
         * <br>
         * <p>*   Default value: **0**.</p>
         * <p>*   Unit: pixel.</p>
         */
        @NameInMap("Margin")
        public String margin;

        /**
         * <p>The distance between two consecutive single images in the tiled image.</p>
         * <br>
         * <p>*   Default value: **0**.</p>
         * <p>*   Unit: pixel.</p>
         */
        @NameInMap("Padding")
        public String padding;

        public static SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut self = new SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setCellHeight(String cellHeight) {
            this.cellHeight = cellHeight;
            return this;
        }
        public String getCellHeight() {
            return this.cellHeight;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setCellSelStep(String cellSelStep) {
            this.cellSelStep = cellSelStep;
            return this;
        }
        public String getCellSelStep() {
            return this.cellSelStep;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setCellWidth(String cellWidth) {
            this.cellWidth = cellWidth;
            return this;
        }
        public String getCellWidth() {
            return this.cellWidth;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
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

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setMargin(String margin) {
            this.margin = margin;
            return this;
        }
        public String getMargin() {
            return this.margin;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut setPadding(String padding) {
            this.padding = padding;
            return this;
        }
        public String getPadding() {
            return this.padding;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile extends TeaModel {
        /**
         * <p>The OSS bucket that stores the object.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the region in which the OSS bucket that stores the object is located.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The OSS object that is generated as the output file of the tiling job.</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The ARN of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        public static SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile self = new SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig extends TeaModel {
        /**
         * <p>The snapshot type. Default value: **normal**. Valid values:</p>
         * <br>
         * <p>*   **normal**: normal frames.</p>
         * <p>*   **intra**: I-frames (keyframes).</p>
         * <br>
         * <p>>  If the FrameType parameter is set to intra in the request, only keyframes are captured. If no keyframe is found at a specified time point, the keyframe closest to the specified time point is captured. Keyframes are captured faster than normal frames if the same snapshot rules are applied.</p>
         */
        @NameInMap("FrameType")
        public String frameType;

        /**
         * <p>The height of a captured snapshot.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The interval for capturing snapshots.</p>
         * <br>
         * <p>*   If this parameter is specified in the request, snapshots are captured at intervals. The value must be greater than 0 in the request.</p>
         * <p>*   Unit: seconds.</p>
         * <p>*   Default value: **10**.</p>
         */
        @NameInMap("Interval")
        public String interval;

        /**
         * <p>The number of snapshots. If the Num parameter is set in the request, snapshots are captured at intervals.</p>
         */
        @NameInMap("Num")
        public String num;

        /**
         * <p>The information about the output file of the snapshot job.</p>
         */
        @NameInMap("OutputFile")
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile outputFile;

        /**
         * <p>The tiling configuration.</p>
         */
        @NameInMap("TileOut")
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut tileOut;

        /**
         * <p>The information about the output file of the tiling job.</p>
         */
        @NameInMap("TileOutputFile")
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile tileOutputFile;

        /**
         * <p>The start time for capturing snapshots. Unit: milliseconds.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The width of a captured snapshot.</p>
         */
        @NameInMap("Width")
        public String width;

        public static SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig self = new SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setFrameType(String frameType) {
            this.frameType = frameType;
            return this;
        }
        public String getFrameType() {
            return this.frameType;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setNum(String num) {
            this.num = num;
            return this;
        }
        public String getNum() {
            return this.num;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setOutputFile(SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setTileOut(SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut tileOut) {
            this.tileOut = tileOut;
            return this;
        }
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOut getTileOut() {
            return this.tileOut;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setTileOutputFile(SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile tileOutputFile) {
            this.tileOutputFile = tileOutputFile;
            return this;
        }
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfigTileOutputFile getTileOutputFile() {
            return this.tileOutputFile;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitSnapshotJobResponseBodySnapshotJob extends TeaModel {
        /**
         * <p>The error code returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The number of snapshots that are captured.</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The time when the job was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the snapshot job.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("Input")
        public SubmitSnapshotJobResponseBodySnapshotJobInput input;

        /**
         * <p>The message sent by MNS to notify the user of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult MNSMessageResult;

        /**
         * <p>The error message returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the MPS queue to which the snapshot job is submitted.</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The snapshot capturing configuration.</p>
         */
        @NameInMap("SnapshotConfig")
        public SubmitSnapshotJobResponseBodySnapshotJobSnapshotConfig snapshotConfig;

        /**
         * <p>The status of the snapshot job. Valid values:</p>
         * <br>
         * <p>- **Submitted**: The job is submitted.</p>
         * <p>- **Snapshoting**: The job is being processed.</p>
         * <p>- **Success**: The job is successful.</p>
         * <p>- **Fail**: The job fails.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The number of single images that are contained in the tiled image.</p>
         */
        @NameInMap("TileCount")
        public String tileCount;

        /**
         * <p>The custom data.</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static SubmitSnapshotJobResponseBodySnapshotJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJob self = new SubmitSnapshotJobResponseBodySnapshotJob();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setInput(SubmitSnapshotJobResponseBodySnapshotJobInput input) {
            this.input = input;
            return this;
        }
        public SubmitSnapshotJobResponseBodySnapshotJobInput getInput() {
            return this.input;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setMNSMessageResult(SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public SubmitSnapshotJobResponseBodySnapshotJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
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

    }

}
