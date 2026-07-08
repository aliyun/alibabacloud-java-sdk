// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptTemplateSelectorResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response object.</p>
     */
    @NameInMap("Data")
    public GetPptTemplateSelectorResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>错误消息</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPptTemplateSelectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPptTemplateSelectorResponseBody self = new GetPptTemplateSelectorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPptTemplateSelectorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPptTemplateSelectorResponseBody setData(GetPptTemplateSelectorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPptTemplateSelectorResponseBodyData getData() {
        return this.data;
    }

    public GetPptTemplateSelectorResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPptTemplateSelectorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPptTemplateSelectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPptTemplateSelectorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPptTemplateSelectorResponseBodyDataCareer extends TeaModel {
        /**
         * <p>The career ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the career is popular.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsHot")
        public Long isHot;

        /**
         * <p>The career name.</p>
         * 
         * <strong>example:</strong>
         * <p>教育培训</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetPptTemplateSelectorResponseBodyDataCareer build(java.util.Map<String, ?> map) throws Exception {
            GetPptTemplateSelectorResponseBodyDataCareer self = new GetPptTemplateSelectorResponseBodyDataCareer();
            return TeaModel.build(map, self);
        }

        public GetPptTemplateSelectorResponseBodyDataCareer setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPptTemplateSelectorResponseBodyDataCareer setIsHot(Long isHot) {
            this.isHot = isHot;
            return this;
        }
        public Long getIsHot() {
            return this.isHot;
        }

        public GetPptTemplateSelectorResponseBodyDataCareer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPptTemplateSelectorResponseBodyDataColour extends TeaModel {
        /**
         * <p>The color value.</p>
         * 
         * <strong>example:</strong>
         * <p>#FCC462</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The color ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The color name.</p>
         * 
         * <strong>example:</strong>
         * <p>橙色</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetPptTemplateSelectorResponseBodyDataColour build(java.util.Map<String, ?> map) throws Exception {
            GetPptTemplateSelectorResponseBodyDataColour self = new GetPptTemplateSelectorResponseBodyDataColour();
            return TeaModel.build(map, self);
        }

        public GetPptTemplateSelectorResponseBodyDataColour setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPptTemplateSelectorResponseBodyDataColour setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPptTemplateSelectorResponseBodyDataColour setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPptTemplateSelectorResponseBodyDataSuitScene extends TeaModel {
        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>教育培训</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetPptTemplateSelectorResponseBodyDataSuitScene build(java.util.Map<String, ?> map) throws Exception {
            GetPptTemplateSelectorResponseBodyDataSuitScene self = new GetPptTemplateSelectorResponseBodyDataSuitScene();
            return TeaModel.build(map, self);
        }

        public GetPptTemplateSelectorResponseBodyDataSuitScene setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPptTemplateSelectorResponseBodyDataSuitScene setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetPptTemplateSelectorResponseBodyDataSuitStyle extends TeaModel {
        /**
         * <p>The style ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The style name.</p>
         * 
         * <strong>example:</strong>
         * <p>扁平简约</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetPptTemplateSelectorResponseBodyDataSuitStyle build(java.util.Map<String, ?> map) throws Exception {
            GetPptTemplateSelectorResponseBodyDataSuitStyle self = new GetPptTemplateSelectorResponseBodyDataSuitStyle();
            return TeaModel.build(map, self);
        }

        public GetPptTemplateSelectorResponseBodyDataSuitStyle setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPptTemplateSelectorResponseBodyDataSuitStyle setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetPptTemplateSelectorResponseBodyData extends TeaModel {
        /**
         * <p>The careers.</p>
         */
        @NameInMap("Career")
        public java.util.List<GetPptTemplateSelectorResponseBodyDataCareer> career;

        /**
         * <p>The colors.</p>
         */
        @NameInMap("Colour")
        public java.util.List<GetPptTemplateSelectorResponseBodyDataColour> colour;

        /**
         * <p>The scenarios.</p>
         */
        @NameInMap("SuitScene")
        public java.util.List<GetPptTemplateSelectorResponseBodyDataSuitScene> suitScene;

        /**
         * <p>The styles.</p>
         */
        @NameInMap("SuitStyle")
        public java.util.List<GetPptTemplateSelectorResponseBodyDataSuitStyle> suitStyle;

        public static GetPptTemplateSelectorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPptTemplateSelectorResponseBodyData self = new GetPptTemplateSelectorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPptTemplateSelectorResponseBodyData setCareer(java.util.List<GetPptTemplateSelectorResponseBodyDataCareer> career) {
            this.career = career;
            return this;
        }
        public java.util.List<GetPptTemplateSelectorResponseBodyDataCareer> getCareer() {
            return this.career;
        }

        public GetPptTemplateSelectorResponseBodyData setColour(java.util.List<GetPptTemplateSelectorResponseBodyDataColour> colour) {
            this.colour = colour;
            return this;
        }
        public java.util.List<GetPptTemplateSelectorResponseBodyDataColour> getColour() {
            return this.colour;
        }

        public GetPptTemplateSelectorResponseBodyData setSuitScene(java.util.List<GetPptTemplateSelectorResponseBodyDataSuitScene> suitScene) {
            this.suitScene = suitScene;
            return this;
        }
        public java.util.List<GetPptTemplateSelectorResponseBodyDataSuitScene> getSuitScene() {
            return this.suitScene;
        }

        public GetPptTemplateSelectorResponseBodyData setSuitStyle(java.util.List<GetPptTemplateSelectorResponseBodyDataSuitStyle> suitStyle) {
            this.suitStyle = suitStyle;
            return this;
        }
        public java.util.List<GetPptTemplateSelectorResponseBodyDataSuitStyle> getSuitStyle() {
            return this.suitStyle;
        }

    }

}
