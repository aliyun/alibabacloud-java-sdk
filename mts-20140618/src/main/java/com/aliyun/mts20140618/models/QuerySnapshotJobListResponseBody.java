// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySnapshotJobListResponseBody extends TeaModel {
    /**
     * <p>The OSS object that is used as the input file.</p>
     * 
     * <strong>example:</strong>
     * <p>b11c171cced04565b1f38f1ecc39****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The OSS object that is generated as the output file of the tiling job.</p>
     */
    @NameInMap("NonExistSnapshotJobIds")
    public QuerySnapshotJobListResponseBodyNonExistSnapshotJobIds nonExistSnapshotJobIds;

    /**
     * <p>The ID of the snapshot job.</p>
     * 
     * <strong>example:</strong>
     * <p>34BCAB31-2833-43A7-9FBD-B34302AB23EQ</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The distance between images.</p>
     * <ul>
     * <li>Default value: <strong>0</strong>.</li>
     * <li>Unit: pixel.</li>
     * </ul>
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
         * <p>The ID of the snapshot job.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the MPS queue to which the snapshot job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>example-location</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The error code returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
         * 
         * <strong>example:</strong>
         * <p>example.flv</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The custom data.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1:role/testrole</p>
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
         * <p>The number of snapshots that were taken.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The OSS bucket that stores the input file.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource operated InputFile is bad</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the region in which the input OSS bucket is located.</p>
         * 
         * <strong>example:</strong>
         * <p>799454621135656C7F815F198A76****</p>
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
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the region in which the output OSS bucket is located.</p>
         * 
         * <strong>example:</strong>
         * <p>example-location</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The OSS object that is generated as the output file of the tiling job.</p>
         * 
         * <strong>example:</strong>
         * <p>example.png</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The ARN of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1:role/testrole</p>
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
         * <p>The interval for taking snapshots.</p>
         * <ul>
         * <li>If this Interval parameter is specified in the request, snapshots are taken at intervals. The value must be greater than 0.</li>
         * <li>Unit: seconds.</li>
         * <li>Default value: <strong>10</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CellHeight")
        public String cellHeight;

        /**
         * <p>The number of rows that the tiled image can contain. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CellSelStep")
        public String cellSelStep;

        /**
         * <p>The type of the snapshot. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal frames.</li>
         * <li><strong>intra</strong>: I-frames.</li>
         * <li>Default value: <strong>intra</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CellWidth")
        public String cellWidth;

        /**
         * <p>Indicates whether the single images are retained. Default value: <strong>true</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>black</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The height of the output snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Columns")
        public String columns;

        /**
         * <p>The Object Storage Service (OSS) output file of the snapshot job.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsKeepCellPic")
        public String isKeepCellPic;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Lines")
        public String lines;

        /**
         * <p>The width of the output snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Margin")
        public String margin;

        /**
         * <p>The number of columns that the tiled image can contain. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The error code returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The error message returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
         * 
         * <strong>example:</strong>
         * <p>example-location</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The ID of the message. This parameter is not returned if the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>example.png</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The message sent by MNS to notify the user of the job result.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1:role/testrole</p>
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

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTimeArray extends TeaModel {
        @NameInMap("TimePointList")
        public java.util.List<Long> timePointList;

        public static QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTimeArray build(java.util.Map<String, ?> map) throws Exception {
            QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTimeArray self = new QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTimeArray();
            return TeaModel.build(map, self);
        }

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTimeArray setTimePointList(java.util.List<Long> timePointList) {
            this.timePointList = timePointList;
            return this;
        }
        public java.util.List<Long> getTimePointList() {
            return this.timePointList;
        }

    }

    public static class QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig extends TeaModel {
        /**
         * <p>The ID of the region in which the output OSS bucket is located.</p>
         * 
         * <strong>example:</strong>
         * <p>intra</p>
         */
        @NameInMap("FrameType")
        public String frameType;

        /**
         * <p>The number of snapshots to take. If the Num parameter is set in the request, snapshots are taken at intervals.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The OSS object that is generated as the output file of the snapshot job.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public String interval;

        /**
         * <p>The status of the snapshot job. </p>
         * <ul>
         * <li><strong>Submitted</strong>: The job was submitted.</li>
         * <li><strong>Snapshoting</strong>: The job is being processed.</li>
         * <li><strong>Success</strong>: The job was successfully processed.</li>
         * <li><strong>Fail</strong>: The job failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Num")
        public String num;

        /**
         * <p>The OSS output file of the tiling job.</p>
         */
        @NameInMap("OutputFile")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigOutputFile outputFile;

        /**
         * <p>The margin width of the tiled image.</p>
         * <ul>
         * <li>Default value: <strong>0</strong>.</li>
         * <li>Unit: pixel.</li>
         * </ul>
         */
        @NameInMap("TileOut")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOut tileOut;

        /**
         * <p>The error message returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
         */
        @NameInMap("TileOutputFile")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTileOutputFile tileOutputFile;

        /**
         * <p>The width of a single image. The default value is the width of the output snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Time")
        public String time;

        @NameInMap("TimeArray")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTimeArray timeArray;

        /**
         * <p>The OSS bucket that stores the output file.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
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

        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig setTimeArray(QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTimeArray timeArray) {
            this.timeArray = timeArray;
            return this;
        }
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfigTimeArray getTimeArray() {
            return this.timeArray;
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
         * <p>You can call this operation to query up to 10 snapshot jobs at a time.</p>
         * <h2>Limits on QPS</h2>
         * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limit</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The stride of a single image.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-30T12:34:29Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The OSS output file of the tiling job.</p>
         * 
         * <strong>example:</strong>
         * <p>cc6cbef8e8d5481ca536f5d2a466****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The number of snapshots that are contained in the tiled image.</p>
         */
        @NameInMap("Input")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobInput input;

        /**
         * <p>The OSS object that is used as the input file.</p>
         */
        @NameInMap("MNSMessageResult")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobMNSMessageResult MNSMessageResult;

        /**
         * <p>The ARN of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource operated InputFile is bad</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The start time for taking snapshots. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>b11c171cced04565b1f38f1ecc39****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The height of a single image. The default value is the height of the output snapshot.</p>
         */
        @NameInMap("SnapshotConfig")
        public QuerySnapshotJobListResponseBodySnapshotJobListSnapshotJobSnapshotConfig snapshotConfig;

        /**
         * <p>The information about the job input.</p>
         * 
         * <strong>example:</strong>
         * <p>Snapshoting</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The snapshot job IDs that do not exist. This parameter is not returned if all specified snapshot jobs are found.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TileCount")
        public String tileCount;

        /**
         * <p>The token that is used to retrieve the next page of the query results. The value is a 32-bit UUID. If the returned query results cannot be displayed within one page, this parameter is returned. The value of this parameter is updated for each query.</p>
         * 
         * <strong>example:</strong>
         * <p>testid-001</p>
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
