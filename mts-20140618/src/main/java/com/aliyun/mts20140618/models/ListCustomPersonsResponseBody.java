// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCustomPersonsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Categories")
    public ListCustomPersonsResponseBodyCategories categories;

    public static ListCustomPersonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomPersonsResponseBody self = new ListCustomPersonsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomPersonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomPersonsResponseBody setCategories(ListCustomPersonsResponseBodyCategories categories) {
        this.categories = categories;
        return this;
    }
    public ListCustomPersonsResponseBodyCategories getCategories() {
        return this.categories;
    }

    public static class ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFacesFace extends TeaModel {
        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("FaceId")
        public String faceId;

        public static ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFacesFace build(java.util.Map<String, ?> map) throws Exception {
            ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFacesFace self = new ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFacesFace();
            return TeaModel.build(map, self);
        }

        public ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFacesFace setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFacesFace setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

    }

    public static class ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFaces extends TeaModel {
        @NameInMap("Face")
        public java.util.List<ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFacesFace> face;

        public static ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFaces build(java.util.Map<String, ?> map) throws Exception {
            ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFaces self = new ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFaces();
            return TeaModel.build(map, self);
        }

        public ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFaces setFace(java.util.List<ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFacesFace> face) {
            this.face = face;
            return this;
        }
        public java.util.List<ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFacesFace> getFace() {
            return this.face;
        }

    }

    public static class ListCustomPersonsResponseBodyCategoriesCategoryPersonsPerson extends TeaModel {
        @NameInMap("PersonName")
        public String personName;

        @NameInMap("PersonDescription")
        public String personDescription;

        @NameInMap("Faces")
        public ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFaces faces;

        @NameInMap("PersonId")
        public String personId;

        public static ListCustomPersonsResponseBodyCategoriesCategoryPersonsPerson build(java.util.Map<String, ?> map) throws Exception {
            ListCustomPersonsResponseBodyCategoriesCategoryPersonsPerson self = new ListCustomPersonsResponseBodyCategoriesCategoryPersonsPerson();
            return TeaModel.build(map, self);
        }

        public ListCustomPersonsResponseBodyCategoriesCategoryPersonsPerson setPersonName(String personName) {
            this.personName = personName;
            return this;
        }
        public String getPersonName() {
            return this.personName;
        }

        public ListCustomPersonsResponseBodyCategoriesCategoryPersonsPerson setPersonDescription(String personDescription) {
            this.personDescription = personDescription;
            return this;
        }
        public String getPersonDescription() {
            return this.personDescription;
        }

        public ListCustomPersonsResponseBodyCategoriesCategoryPersonsPerson setFaces(ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFaces faces) {
            this.faces = faces;
            return this;
        }
        public ListCustomPersonsResponseBodyCategoriesCategoryPersonsPersonFaces getFaces() {
            return this.faces;
        }

        public ListCustomPersonsResponseBodyCategoriesCategoryPersonsPerson setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

    }

    public static class ListCustomPersonsResponseBodyCategoriesCategoryPersons extends TeaModel {
        @NameInMap("Person")
        public java.util.List<ListCustomPersonsResponseBodyCategoriesCategoryPersonsPerson> person;

        public static ListCustomPersonsResponseBodyCategoriesCategoryPersons build(java.util.Map<String, ?> map) throws Exception {
            ListCustomPersonsResponseBodyCategoriesCategoryPersons self = new ListCustomPersonsResponseBodyCategoriesCategoryPersons();
            return TeaModel.build(map, self);
        }

        public ListCustomPersonsResponseBodyCategoriesCategoryPersons setPerson(java.util.List<ListCustomPersonsResponseBodyCategoriesCategoryPersonsPerson> person) {
            this.person = person;
            return this;
        }
        public java.util.List<ListCustomPersonsResponseBodyCategoriesCategoryPersonsPerson> getPerson() {
            return this.person;
        }

    }

    public static class ListCustomPersonsResponseBodyCategoriesCategory extends TeaModel {
        @NameInMap("Persons")
        public ListCustomPersonsResponseBodyCategoriesCategoryPersons persons;

        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("CategoryDescription")
        public String categoryDescription;

        public static ListCustomPersonsResponseBodyCategoriesCategory build(java.util.Map<String, ?> map) throws Exception {
            ListCustomPersonsResponseBodyCategoriesCategory self = new ListCustomPersonsResponseBodyCategoriesCategory();
            return TeaModel.build(map, self);
        }

        public ListCustomPersonsResponseBodyCategoriesCategory setPersons(ListCustomPersonsResponseBodyCategoriesCategoryPersons persons) {
            this.persons = persons;
            return this;
        }
        public ListCustomPersonsResponseBodyCategoriesCategoryPersons getPersons() {
            return this.persons;
        }

        public ListCustomPersonsResponseBodyCategoriesCategory setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListCustomPersonsResponseBodyCategoriesCategory setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListCustomPersonsResponseBodyCategoriesCategory setCategoryDescription(String categoryDescription) {
            this.categoryDescription = categoryDescription;
            return this;
        }
        public String getCategoryDescription() {
            return this.categoryDescription;
        }

    }

    public static class ListCustomPersonsResponseBodyCategories extends TeaModel {
        @NameInMap("Category")
        public java.util.List<ListCustomPersonsResponseBodyCategoriesCategory> category;

        public static ListCustomPersonsResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            ListCustomPersonsResponseBodyCategories self = new ListCustomPersonsResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public ListCustomPersonsResponseBodyCategories setCategory(java.util.List<ListCustomPersonsResponseBodyCategoriesCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<ListCustomPersonsResponseBodyCategoriesCategory> getCategory() {
            return this.category;
        }

    }

}
