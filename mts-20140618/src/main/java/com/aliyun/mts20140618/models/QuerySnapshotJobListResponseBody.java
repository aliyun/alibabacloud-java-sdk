// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySnapshotJobListResponseBody extends TeaModel {
    /**
     * <p>The token that is used to retrieve the next page of the query results. The value is a 32-bit UUID. If the returned query results cannot be displayed within one page, this parameter is returned. The value of this parameter is updated for each query.</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The snapshot job IDs that do not exist. This parameter is not returned if all specified snapshot jobs are found.</p>
     */
    @NameInMap("NonExistSnapshotJobIds")
    public QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds nonExistSnapshotJobIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the snapshot jobs.</p>
     */
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
        /**
         * <p>The OSS bucket that stores the input file.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the region in which the input OSS bucket is located.</p>
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
        /**
         * <p>The error code returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the message. This parameter is not returned if the job fails.</p>
         */
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
        /**
         * <p>The OSS bucket that stores the output file.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the region in which the output OSS bucket is located.</p>
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
        /**
         * <p>The height of a single image. The default value is the height of the output snapshot.</p>
         */
        @NameInMap("CellHeight")
        public String cellHeight;

        /**
         * <p>The stride of a single image.</p>
         */
        @NameInMap("CellSelStep")
        public String cellSelStep;

        /**
         * <p>The width of a single image. The default value is the width of the output snapshot.</p>
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
         * <p>The number of columns that the tiled image can contain. Default value: **10**.</p>
         */
        @NameInMap("Columns")
        public String columns;

        /**
         * <p>Indicates whether the single images are retained. Default value: **true**.</p>
         */
        @NameInMap("IsKeepCellPic")
        public String isKeepCellPic;

        /**
         * <p>The number of rows that the tiled image can contain. Default value: **10**.</p>
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
         * <p>The distance between images.</p>
         * <br>
         * <p>*   Default value: **0**.</p>
         * <p>*   Unit: pixel.</p>
         */
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
        /**
         * <p>The OSS bucket that stores the output file.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the region in which the output OSS bucket is located.</p>
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
        /**
         * <p>The type of the snapshot. Valid values:</p>
         * <br>
         * <p>*   **normal**: normal frames.</p>
         * <p>*   **intra**: I-frames.</p>
         * <p>*   Default value: **intra**.</p>
         */
        @NameInMap("FrameType")
        public String frameType;

        /**
         * <p>The height of the output snapshot.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The interval for taking snapshots.</p>
         * <br>
         * <p>*   If this Interval parameter is specified in the request, snapshots are taken at intervals. The value must be greater than 0.</p>
         * <p>*   Unit: seconds.</p>
         * <p>*   Default value: **10**.</p>
         */
        @NameInMap("Interval")
        public String interval;

        /**
         * <p>The number of snapshots to take. If the Num parameter is set in the request, snapshots are taken at intervals.</p>
         */
        @NameInMap("Num")
        public String num;

        /**
         * <p>The Object Storage Service (OSS) output file of the snapshot job.</p>
         */
        @NameInMap("OutputFile")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile outputFile;

        /**
         * <p>The tiling configuration.</p>
         */
        @NameInMap("TileOut")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut tileOut;

        /**
         * <p>The OSS output file of the tiling job.</p>
         */
        @NameInMap("TileOutputFile")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile tileOutputFile;

        /**
         * <p>The start time for taking snapshots. Unit: milliseconds.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The width of the output snapshot.</p>
         */
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
        /**
         * <p>The error code returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The number of snapshots that were taken.</p>
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
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput input;

        /**
         * <p>The message sent by MNS to notify the user of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult MNSMessageResult;

        /**
         * <p>The error message returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the MPS queue to which the snapshot job was submitted.</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The snapshot configuration.</p>
         */
        @NameInMap("SnapshotConfig")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig snapshotConfig;

        /**
         * <p>The status of the snapshot job. </p>
         * <br>
         * <p>- **Submitted**: The job was submitted.</p>
         * <p>- **Snapshoting**: The job is being processed.</p>
         * <p>- **Success**: The job was successfully processed.</p>
         * <p>- **Fail**: The job failed.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The number of snapshots that are contained in the tiled image.</p>
         */
        @NameInMap("TileCount")
        public String tileCount;

        /**
         * <p>The custom data.</p>
         */
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
