// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class ListProductsByPopCodeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDetailMessage")
    public String errorDetailMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Result")
    public java.util.List<ListProductsByPopCodeResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static ListProductsByPopCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsByPopCodeResponseBody self = new ListProductsByPopCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsByPopCodeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListProductsByPopCodeResponseBody setErrorDetailMessage(String errorDetailMessage) {
        this.errorDetailMessage = errorDetailMessage;
        return this;
    }
    public String getErrorDetailMessage() {
        return this.errorDetailMessage;
    }

    public ListProductsByPopCodeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProductsByPopCodeResponseBody setResult(java.util.List<ListProductsByPopCodeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListProductsByPopCodeResponseBodyResult> getResult() {
        return this.result;
    }

    public ListProductsByPopCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProductsByPopCodeResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOBusinessOwnerList extends TeaModel {
        @NameInMap("BucId")
        public String bucId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOBusinessOwnerList build(java.util.Map<String, ?> map) throws Exception {
            ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOBusinessOwnerList self = new ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOBusinessOwnerList();
            return TeaModel.build(map, self);
        }

        public ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOBusinessOwnerList setBucId(String bucId) {
            this.bucId = bucId;
            return this;
        }
        public String getBucId() {
            return this.bucId;
        }

        public ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOBusinessOwnerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOBusinessOwnerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOTechniqueOwnerList extends TeaModel {
        @NameInMap("BucId")
        public String bucId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOTechniqueOwnerList build(java.util.Map<String, ?> map) throws Exception {
            ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOTechniqueOwnerList self = new ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOTechniqueOwnerList();
            return TeaModel.build(map, self);
        }

        public ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOTechniqueOwnerList setBucId(String bucId) {
            this.bucId = bucId;
            return this;
        }
        public String getBucId() {
            return this.bucId;
        }

        public ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOTechniqueOwnerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOTechniqueOwnerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListProductsByPopCodeResponseBodyResultNameSpaceExtDTO extends TeaModel {
        @NameInMap("BusinessOwnerList")
        public java.util.List<ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOBusinessOwnerList> businessOwnerList;

        @NameInMap("TechniqueOwnerList")
        public java.util.List<ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOTechniqueOwnerList> techniqueOwnerList;

        public static ListProductsByPopCodeResponseBodyResultNameSpaceExtDTO build(java.util.Map<String, ?> map) throws Exception {
            ListProductsByPopCodeResponseBodyResultNameSpaceExtDTO self = new ListProductsByPopCodeResponseBodyResultNameSpaceExtDTO();
            return TeaModel.build(map, self);
        }

        public ListProductsByPopCodeResponseBodyResultNameSpaceExtDTO setBusinessOwnerList(java.util.List<ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOBusinessOwnerList> businessOwnerList) {
            this.businessOwnerList = businessOwnerList;
            return this;
        }
        public java.util.List<ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOBusinessOwnerList> getBusinessOwnerList() {
            return this.businessOwnerList;
        }

        public ListProductsByPopCodeResponseBodyResultNameSpaceExtDTO setTechniqueOwnerList(java.util.List<ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOTechniqueOwnerList> techniqueOwnerList) {
            this.techniqueOwnerList = techniqueOwnerList;
            return this;
        }
        public java.util.List<ListProductsByPopCodeResponseBodyResultNameSpaceExtDTOTechniqueOwnerList> getTechniqueOwnerList() {
            return this.techniqueOwnerList;
        }

    }

    public static class ListProductsByPopCodeResponseBodyResultUniqueKeyDTO extends TeaModel {
        @NameInMap("NamespaceCode")
        public String namespaceCode;

        public static ListProductsByPopCodeResponseBodyResultUniqueKeyDTO build(java.util.Map<String, ?> map) throws Exception {
            ListProductsByPopCodeResponseBodyResultUniqueKeyDTO self = new ListProductsByPopCodeResponseBodyResultUniqueKeyDTO();
            return TeaModel.build(map, self);
        }

        public ListProductsByPopCodeResponseBodyResultUniqueKeyDTO setNamespaceCode(String namespaceCode) {
            this.namespaceCode = namespaceCode;
            return this;
        }
        public String getNamespaceCode() {
            return this.namespaceCode;
        }

    }

    public static class ListProductsByPopCodeResponseBodyResult extends TeaModel {
        @NameInMap("NameSpaceExtDTO")
        public ListProductsByPopCodeResponseBodyResultNameSpaceExtDTO nameSpaceExtDTO;

        @NameInMap("UniqueKeyDTO")
        public ListProductsByPopCodeResponseBodyResultUniqueKeyDTO uniqueKeyDTO;

        public static ListProductsByPopCodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListProductsByPopCodeResponseBodyResult self = new ListProductsByPopCodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListProductsByPopCodeResponseBodyResult setNameSpaceExtDTO(ListProductsByPopCodeResponseBodyResultNameSpaceExtDTO nameSpaceExtDTO) {
            this.nameSpaceExtDTO = nameSpaceExtDTO;
            return this;
        }
        public ListProductsByPopCodeResponseBodyResultNameSpaceExtDTO getNameSpaceExtDTO() {
            return this.nameSpaceExtDTO;
        }

        public ListProductsByPopCodeResponseBodyResult setUniqueKeyDTO(ListProductsByPopCodeResponseBodyResultUniqueKeyDTO uniqueKeyDTO) {
            this.uniqueKeyDTO = uniqueKeyDTO;
            return this;
        }
        public ListProductsByPopCodeResponseBodyResultUniqueKeyDTO getUniqueKeyDTO() {
            return this.uniqueKeyDTO;
        }

    }

}
