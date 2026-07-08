// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class GetImageTranslateTaskResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>A JSON object that contains the returned data.</p>
     */
    @NameInMap("data")
    public GetImageTranslateTaskResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, used to trace the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>377A48D7-7CFA-53F9-8CA2-14FE3F2774B6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>Indicates whether the request is synchronous.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("synchro")
    public Boolean synchro;

    public static GetImageTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageTranslateTaskResponseBody self = new GetImageTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageTranslateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetImageTranslateTaskResponseBody setData(GetImageTranslateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageTranslateTaskResponseBodyData getData() {
        return this.data;
    }

    public GetImageTranslateTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetImageTranslateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageTranslateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetImageTranslateTaskResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownLeft extends TeaModel {
        /**
         * <p>The x-coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("x")
        public Long x;

        /**
         * <p>The y-coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>145</p>
         */
        @NameInMap("y")
        public Long y;

        public static GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownLeft build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownLeft self = new GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownLeft();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownLeft setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownLeft setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownRight extends TeaModel {
        /**
         * <p>The x-coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>327</p>
         */
        @NameInMap("x")
        public Long x;

        /**
         * <p>The y-coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>148</p>
         */
        @NameInMap("y")
        public Long y;

        public static GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownRight build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownRight self = new GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownRight();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownRight setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownRight setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpLeft extends TeaModel {
        /**
         * <p>The x-coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("x")
        public Long x;

        /**
         * <p>The y-coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("y")
        public Long y;

        public static GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpLeft build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpLeft self = new GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpLeft();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpLeft setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpLeft setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpRight extends TeaModel {
        /**
         * <p>The x-coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>328</p>
         */
        @NameInMap("x")
        public Long x;

        /**
         * <p>The y-coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("y")
        public Long y;

        public static GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpRight build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpRight self = new GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpRight();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpRight setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpRight setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes extends TeaModel {
        /**
         * <p>The confidence score for the recognized text. The value ranges from 0 (lowest confidence) to 1 (highest confidence).</p>
         * 
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        @NameInMap("confidence")
        public Float confidence;

        /**
         * <p>The text direction. Valid values: <code>0</code> (horizontal) and <code>1</code> (vertical).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("direction")
        public Long direction;

        /**
         * <p>The coordinates of the lower-left corner of the bounding box.</p>
         */
        @NameInMap("downLeft")
        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownLeft downLeft;

        /**
         * <p>The coordinates of the lower-right corner of the bounding box.</p>
         */
        @NameInMap("downRight")
        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownRight downRight;

        /**
         * <p>The cell ID of the bounding box. If the bounding box is not part of a table, the value is <code>-1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tableCellId")
        public Long tableCellId;

        /**
         * <p>The ID of the table that contains the bounding box. If the bounding box is not part of a table, the value is <code>-1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tableId")
        public Long tableId;

        /**
         * <p>The source-language text within the bounding box.</p>
         * 
         * <strong>example:</strong>
         * <p>修护头皮</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <p>An object containing the translated text, keyed by the target language code.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;en&quot;: &quot;Restore Scalp Health&quot; }</p>
         */
        @NameInMap("translation")
        public java.util.Map<String, ?> translation;

        /**
         * <p>The coordinates of the upper-left corner of the bounding box.</p>
         */
        @NameInMap("upLeft")
        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpLeft upLeft;

        /**
         * <p>The coordinates of the upper-right corner of the bounding box.</p>
         */
        @NameInMap("upRight")
        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpRight upRight;

        public static GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes self = new GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes setDirection(Long direction) {
            this.direction = direction;
            return this;
        }
        public Long getDirection() {
            return this.direction;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes setDownLeft(GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownLeft downLeft) {
            this.downLeft = downLeft;
            return this;
        }
        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownLeft getDownLeft() {
            return this.downLeft;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes setDownRight(GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownRight downRight) {
            this.downRight = downRight;
            return this;
        }
        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesDownRight getDownRight() {
            return this.downRight;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes setTableCellId(Long tableCellId) {
            this.tableCellId = tableCellId;
            return this;
        }
        public Long getTableCellId() {
            return this.tableCellId;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes setTranslation(java.util.Map<String, ?> translation) {
            this.translation = translation;
            return this;
        }
        public java.util.Map<String, ?> getTranslation() {
            return this.translation;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes setUpLeft(GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpLeft upLeft) {
            this.upLeft = upLeft;
            return this;
        }
        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpLeft getUpLeft() {
            return this.upLeft;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes setUpRight(GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpRight upRight) {
            this.upRight = upRight;
            return this;
        }
        public GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxesUpRight getUpRight() {
            return this.upRight;
        }

    }

    public static class GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfosPos extends TeaModel {
        /**
         * <p>The x-coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("x")
        public Long x;

        /**
         * <p>The y-coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("y")
        public Long y;

        public static GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfosPos build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfosPos self = new GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfosPos();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfosPos setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfosPos setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos extends TeaModel {
        /**
         * <p>An array of coordinates defining the cell\&quot;s bounding box.</p>
         */
        @NameInMap("pos")
        public java.util.List<GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfosPos> pos;

        /**
         * <p>The cell ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tableCellId")
        public Long tableCellId;

        /**
         * <p>The text content of the cell.</p>
         * 
         * <strong>example:</strong>
         * <p>活动价</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <p>The ending column index of the cell. The index starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("xec")
        public Long xec;

        /**
         * <p>The starting column index of the cell. The index starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("xsc")
        public Long xsc;

        /**
         * <p>The ending row index of the cell. The index starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("yec")
        public Long yec;

        /**
         * <p>The starting row index of the cell. The index starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ysc")
        public Long ysc;

        public static GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos self = new GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos setPos(java.util.List<GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfosPos> pos) {
            this.pos = pos;
            return this;
        }
        public java.util.List<GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfosPos> getPos() {
            return this.pos;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos setTableCellId(Long tableCellId) {
            this.tableCellId = tableCellId;
            return this;
        }
        public Long getTableCellId() {
            return this.tableCellId;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos setXec(Long xec) {
            this.xec = xec;
            return this;
        }
        public Long getXec() {
            return this.xec;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos setXsc(Long xsc) {
            this.xsc = xsc;
            return this;
        }
        public Long getXsc() {
            return this.xsc;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos setYec(Long yec) {
            this.yec = yec;
            return this;
        }
        public Long getYec() {
            return this.yec;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos setYsc(Long ysc) {
            this.ysc = ysc;
            return this;
        }
        public Long getYsc() {
            return this.ysc;
        }

    }

    public static class GetImageTranslateTaskResponseBodyDataTranslationTableInfos extends TeaModel {
        /**
         * <p>Information about the cells within the table.</p>
         */
        @NameInMap("cellInfos")
        public java.util.List<GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos> cellInfos;

        /**
         * <p>The ID of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tableId")
        public Long tableId;

        /**
         * <p>The number of columns in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("xCellSize")
        public Long xCellSize;

        /**
         * <p>The number of rows in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("yCellSize")
        public Long yCellSize;

        public static GetImageTranslateTaskResponseBodyDataTranslationTableInfos build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateTaskResponseBodyDataTranslationTableInfos self = new GetImageTranslateTaskResponseBodyDataTranslationTableInfos();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfos setCellInfos(java.util.List<GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos> cellInfos) {
            this.cellInfos = cellInfos;
            return this;
        }
        public java.util.List<GetImageTranslateTaskResponseBodyDataTranslationTableInfosCellInfos> getCellInfos() {
            return this.cellInfos;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfos setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfos setXCellSize(Long xCellSize) {
            this.xCellSize = xCellSize;
            return this;
        }
        public Long getXCellSize() {
            return this.xCellSize;
        }

        public GetImageTranslateTaskResponseBodyDataTranslationTableInfos setYCellSize(Long yCellSize) {
            this.yCellSize = yCellSize;
            return this;
        }
        public Long getYCellSize() {
            return this.yCellSize;
        }

    }

    public static class GetImageTranslateTaskResponseBodyDataTranslation extends TeaModel {
        /**
         * <p>The rotation angle of the image in degrees.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("angle")
        public Long angle;

        /**
         * <p>An array of detected bounding boxes.</p>
         */
        @NameInMap("boundingBoxes")
        public java.util.List<GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes> boundingBoxes;

        /**
         * <p>The number of detected bounding boxes.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("boxesCount")
        public Long boxesCount;

        /**
         * <p>The height of the image after rotation, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("height")
        public Long height;

        /**
         * <p>The height of the original image, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("orgHeight")
        public Long orgHeight;

        /**
         * <p>The width of the original image, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("orgWidth")
        public Long orgWidth;

        /**
         * <p>Information about tables detected in the image.</p>
         */
        @NameInMap("tableInfos")
        public java.util.List<GetImageTranslateTaskResponseBodyDataTranslationTableInfos> tableInfos;

        /**
         * <p>The width of the image after rotation, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("width")
        public Long width;

        public static GetImageTranslateTaskResponseBodyDataTranslation build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateTaskResponseBodyDataTranslation self = new GetImageTranslateTaskResponseBodyDataTranslation();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateTaskResponseBodyDataTranslation setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public GetImageTranslateTaskResponseBodyDataTranslation setBoundingBoxes(java.util.List<GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes> boundingBoxes) {
            this.boundingBoxes = boundingBoxes;
            return this;
        }
        public java.util.List<GetImageTranslateTaskResponseBodyDataTranslationBoundingBoxes> getBoundingBoxes() {
            return this.boundingBoxes;
        }

        public GetImageTranslateTaskResponseBodyDataTranslation setBoxesCount(Long boxesCount) {
            this.boxesCount = boxesCount;
            return this;
        }
        public Long getBoxesCount() {
            return this.boxesCount;
        }

        public GetImageTranslateTaskResponseBodyDataTranslation setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public GetImageTranslateTaskResponseBodyDataTranslation setOrgHeight(Long orgHeight) {
            this.orgHeight = orgHeight;
            return this;
        }
        public Long getOrgHeight() {
            return this.orgHeight;
        }

        public GetImageTranslateTaskResponseBodyDataTranslation setOrgWidth(Long orgWidth) {
            this.orgWidth = orgWidth;
            return this;
        }
        public Long getOrgWidth() {
            return this.orgWidth;
        }

        public GetImageTranslateTaskResponseBodyDataTranslation setTableInfos(java.util.List<GetImageTranslateTaskResponseBodyDataTranslationTableInfos> tableInfos) {
            this.tableInfos = tableInfos;
            return this;
        }
        public java.util.List<GetImageTranslateTaskResponseBodyDataTranslationTableInfos> getTableInfos() {
            return this.tableInfos;
        }

        public GetImageTranslateTaskResponseBodyDataTranslation setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class GetImageTranslateTaskResponseBodyData extends TeaModel {
        /**
         * <p>The trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>213e391517328463424251152ec9fb</p>
         */
        @NameInMap("traceId")
        public String traceId;

        /**
         * <p>An object containing the translation result.</p>
         */
        @NameInMap("translation")
        public GetImageTranslateTaskResponseBodyDataTranslation translation;

        public static GetImageTranslateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateTaskResponseBodyData self = new GetImageTranslateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateTaskResponseBodyData setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetImageTranslateTaskResponseBodyData setTranslation(GetImageTranslateTaskResponseBodyDataTranslation translation) {
            this.translation = translation;
            return this;
        }
        public GetImageTranslateTaskResponseBodyDataTranslation getTranslation() {
            return this.translation;
        }

    }

}
